package br.com.moip.resource;

public class CaptureMethod {

    private Type type;
    private String voucher;
    private String stoneId;

    public Type getType() {
        return type;
    }

    public String getVoucher() {
        return voucher;
    }

    public String getStoneId() {
        return stoneId;
    }

    private enum Type {
        MPOS;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CaptureMethod{");
        sb.append("type=").append(type);
        sb.append(", voucher='").append(voucher).append('\'');
        sb.append(", stoneId='").append(stoneId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
