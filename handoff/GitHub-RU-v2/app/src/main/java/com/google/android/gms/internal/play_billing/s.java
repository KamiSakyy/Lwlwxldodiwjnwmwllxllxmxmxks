package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s {
    public Object a;
    public Object b;
    public Object c;

    public s(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.b);
        return new IllegalArgumentException(no.a.q(a0.s0.o("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.c)));
    }
}
