package androidx.datastore.preferences.protobuf;

/* loaded from: /home/user/work/p/classes.dex */
public final class g0 {
    public static f0 a(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        f0 f0Var2 = (f0) obj2;
        if (!f0Var2.isEmpty()) {
            if (!f0Var.f2278r) {
                f0Var = f0Var.b();
            }
            f0Var.a();
            if (!f0Var2.isEmpty()) {
                f0Var.putAll(f0Var2);
            }
        }
        return f0Var;
    }
}
