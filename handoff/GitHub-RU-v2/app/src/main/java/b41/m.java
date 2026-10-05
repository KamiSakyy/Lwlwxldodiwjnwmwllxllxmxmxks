package b41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m {
    public int a;
    public byte b;

    public final n a() {
        if (this.b == 3) {
            return new n(this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.b & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
