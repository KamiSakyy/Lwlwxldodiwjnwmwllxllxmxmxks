package d61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements b, c61.a {
    public final Object a;

    public c(Object obj) {
        this.a = obj;
    }

    public static c a(Object obj) {
        if (obj != null) {
            return new c(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // v61.a
    public final Object get() {
        return this.a;
    }
    public Object f = null;
}
