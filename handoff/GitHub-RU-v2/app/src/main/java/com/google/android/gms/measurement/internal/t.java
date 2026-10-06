package com.google.android.gms.measurement.internal;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t {
    public String a;
    public String b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Long h;
    public Long i;
    public Long j;
    public Boolean k;

    public t(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        c21.uShadow.d(str);
        c21.uShadow.d(str2);
        c21.uShadow.b(j >= 0);
        c21.uShadow.b(j2 >= 0);
        c21.uShadow.b(j3 >= 0);
        c21.uShadow.b(j5 >= 0);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    public final t a(long j) {
        return new t(this.a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }

    public final t b(Long l, Long l2, Boolean bool) {
        return new t(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, bool);
    }
    public Object e = null;
    public Object q(Object p1) { return null; }
    public Object s(Object p1, long p2, boolean p3) { return null; }
    public Object w(Object p1, Object p2) { return null; }
}
