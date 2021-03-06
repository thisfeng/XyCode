package com.xmethod.xycode.debugHelper.debug;

import com.xmethod.xycode.interfaces.Interfaces;
import com.xmethod.xycode.okHttp.Param;

import java.util.UUID;

/**
 * Created by xiuye on 2017/10/26.
 * @author xiuye
 */

public class DebugItem {

    /**
     * 请求地址
     */
    private String url;
    /**
     * 请求结果
     */
    private String json;

    /**
     * 编辑后的请求结果
     */
    private String jsonModify;

    /**
     * Debug Key
     */
    private String key;

    /**
     * 参数
     */
    private Param param;

    /**
     * 请求开始
     */
    private boolean postBegun = false;
    /**
     * 请求完成
     */
    private boolean postFinished = false;

    /**
     * result
     */
    private Interfaces.CB<String> cb;

    public DebugItem(String url) {
        this.url = url;
    }

    public String getKey() {
        if (key == null) {
            key = UUID.randomUUID().toString();
        }
        return key;
    }

    public String getUrl() {
        return url;
    }

    public DebugItem setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getJson() {
        return json;
    }

    public DebugItem setJson(String json) {
        this.json = json;
        return this;
    }

    public String getJsonModify() {
        return jsonModify;
    }

    public DebugItem setJsonModify(String jsonModify) {
        this.jsonModify = jsonModify;
        return this;
    }

    public boolean isPostFinished() {
        return postFinished;
    }

    public DebugItem setPostFinished(boolean postFinished) {
        this.postFinished = postFinished;
        return this;
    }

    public boolean isPostBegun() {
        return postBegun;
    }

    public void setPostBegun(boolean postBegun) {
        this.postBegun = postBegun;
    }

    public Interfaces.CB getCb() {
        return cb;
    }

    public DebugItem setCb(Interfaces.CB cb) {
        this.cb = cb;
        return this;
    }

    public Param getParam() {
        return param;
    }

    public DebugItem setParam(Param param) {
        this.param = param;
        return this;
    }
}
