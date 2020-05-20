package io.servertap.api.v1.models;

import java.util.Date;

/**
 * A ban object
 */
public class ServerBan {
    private String target = null;

    private String source = null;

    private String reason = null;

    private Date expiration = null;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
}
