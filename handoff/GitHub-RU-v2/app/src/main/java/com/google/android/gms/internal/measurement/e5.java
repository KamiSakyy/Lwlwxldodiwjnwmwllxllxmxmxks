package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e5 implements x5 {
    public static final e5 s = new e5(0);
    public final /* synthetic */ int r;

    public /* synthetic */ e5(int i) {
        this.r = i;
    }

    public static final v5 c(Object obj, Object obj2) {
        v5 v5Var = (v5) obj;
        v5 v5Var2 = (v5) obj2;
        if (!v5Var2.isEmpty()) {
            if (!v5Var.r) {
                v5Var = v5Var.a();
            }
            v5Var.c();
            if (!v5Var2.isEmpty()) {
                v5Var.putAll(v5Var2);
            }
        }
        return v5Var;
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public boolean a(Class cls) {
        switch (this.r) {
            case 0:
                return g5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.x5
    public f6 b(Class cls) {
        switch (this.r) {
            case 0:
                if (!g5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (f6) g5.l(cls.asSubclass(g5.class)).o(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
