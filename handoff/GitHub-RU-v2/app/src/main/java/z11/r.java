package z11;

/* loaded from: /home/user/work/p/classes4.dex */
public class r {
    public static final r c = new r(true, null, null);
    public final boolean a;
    public final Throwable b;

    public r(boolean z, String str, Exception exc) {
        this.a = z;
        this.b = exc;
    }

    public static r b(String str) {
        return new r(false, str, null);
    }

    public static r c(String str, Exception exc) {
        return new r(false, str, exc);
    }

    public void a() {
    }
}
