package com.apollographql.apollo.internal;

/* loaded from: /home/user/work/p/classes.dex */
public class b extends c71.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f4293u;

    /* renamed from: v, reason: collision with root package name */
    public int f4294v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f4295w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, a71.c cVar2) {
        super(cVar2);
        this.f4295w = cVar;
    }

    public final Object v(Object obj) {
        this.f4293u = obj;
        this.f4294v |= Integer.MIN_VALUE;
        return this.f4295w.c(null, this);
    }
}
