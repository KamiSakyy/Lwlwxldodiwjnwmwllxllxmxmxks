package com.github.rudroid.discussions.replythread;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class v implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11760r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f11761s;

    public /* synthetic */ v(String str, int i) {
        this.f11760r = i;
        this.f11761s = str;
    }

    public final Object k(Object obj) {
        boolean b10;
        int i = this.f11760r;
        String str = this.f11761s;
        jk.d dVar = (jk.d) obj;
        switch (i) {
            case k5.f.J /* 0 */:
                r71.e[] eVarArr = v0.f11762c0;
                k71.k.g(dVar, "it");
                b10 = k71.k.b(dVar.a.a, str);
                break;
            default:
                r71.e[] eVarArr2 = v0.f11762c0;
                k71.k.g(dVar, "it");
                b10 = k71.k.b(dVar.a.d, str);
                break;
        }
        return Boolean.valueOf(b10);
    }
}
