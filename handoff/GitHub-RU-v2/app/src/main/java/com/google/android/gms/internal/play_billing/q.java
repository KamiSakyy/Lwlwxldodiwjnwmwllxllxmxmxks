package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q extends r {
    public final transient int t;
    public final transient int u;
    public final /* synthetic */ r v;

    public q(r rVar, int i, int i2) {
        this.v = rVar;
        this.t = i;
        this.u = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int b() {
        return this.v.d() + this.t + this.u;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int d() {
        return this.v.d() + this.t;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] g() {
        return this.v.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        y41.t1.U(i, this.u);
        return this.v.get(i + this.t);
    }

    @Override // com.google.android.gms.internal.play_billing.r, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final r subList(int i, int i2) {
        y41.t1.W(i, i2, this.u);
        int i3 = this.t;
        return this.v.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.u;
    }
}
