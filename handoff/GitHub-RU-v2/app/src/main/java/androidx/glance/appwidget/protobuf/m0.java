package androidx.glance.appwidget.protobuf;

/* loaded from: /home/user/work/p/classes.dex */
public final class m0 {
    public static l0 a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        l0 l0Var2 = (l0) obj2;
        if (!l0Var2.isEmpty()) {
            if (!l0Var.f2758r) {
                l0Var = l0Var.c();
            }
            l0Var.b();
            if (!l0Var2.isEmpty()) {
                l0Var.putAll(l0Var2);
            }
        }
        return l0Var;
    }
}
