package com.fallllllll.lipper.data.network.interceptor;

import com.fallllllll.lipper.utils.LogUtils;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by fallllllll on 2017/4/28/028.
 * GitHub :  https://github.com/348476129/Lipper
 */

public class LogInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        long startTime = System.currentTimeMillis();
        Response response = chain.proceed(chain.request());
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        MediaType mediaType = response.body().contentType();
        String content = response.body().string();
        LogUtils.d("\n");
        LogUtils.d("----------Start----------------");
        LogUtils.d("|" + request.toString());
        String method = request.method();
        if ("POST".equals(method)) {
            StringBuilder sb = new StringBuilder();
            if (request.body() instanceof FormBody) {
                FormBody body = (FormBody) request.body();
                for (int i = 0; i < body.size(); i++) {
                    sb.append(body.encodedName(i)).append("=").append(body.encodedValue(i)).append(",");
                }
                sb.delete(sb.length() - 1, sb.length());
                LogUtils.d("| RequestParams:{" + sb.toString() + "}");
            }
        }
        LogUtils.d("| Request Code :" + response.code());
        LogUtils.d("| Response:" + content);
        LogUtils.d("----------End:" + duration + "毫秒----------");
        return response.newBuilder()
                .body(okhttp3.ResponseBody.create(mediaType, content))
                .build();
    }
}
