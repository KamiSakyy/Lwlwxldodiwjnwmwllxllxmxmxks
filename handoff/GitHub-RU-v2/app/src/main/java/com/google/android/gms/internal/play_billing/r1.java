package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r1 implements f2 {
    public static final r1 b = new r1(0);
    public final /* synthetic */ int a;

    public /* synthetic */ r1(int i) {
        this.a = i;
    }

    public static final d2 c(Object obj, Object obj2) {
        d2 d2Var = (d2) obj;
        d2 d2Var2 = (d2) obj2;
        if (!d2Var2.isEmpty()) {
            if (!d2Var.r) {
                if (d2Var.isEmpty()) {
                    d2Var = new d2();
                } else {
                    d2 d2Var3 = new d2(d2Var);
                    d2Var3.r = true;
                    d2Var = d2Var3;
                }
            }
            d2Var.b();
            if (!d2Var2.isEmpty()) {
                d2Var.putAll(d2Var2);
            }
        }
        return d2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.f2
    public n2 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!t1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (n2) t1.m(cls.asSubclass(t1.class)).j(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.f2
    public boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return t1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
