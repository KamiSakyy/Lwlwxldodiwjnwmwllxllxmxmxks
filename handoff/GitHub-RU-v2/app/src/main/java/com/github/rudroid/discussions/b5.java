package com.github.rudroid.discussions;

import com.github.domain.discussions.data.DiscussionCategoryData;

/* loaded from: /home/user/work/p/classes.dex */
public final class b5 extends za {
    public final String A;

    /* renamed from: t, reason: collision with root package name */
    public final le.h f11193t;

    /* renamed from: u, reason: collision with root package name */
    public final DiscussionCategoryData f11194u;

    /* renamed from: v, reason: collision with root package name */
    public final jk.b f11195v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f11196w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11197x;

    /* renamed from: y, reason: collision with root package name */
    public final b01.f f11198y;

    /* renamed from: z, reason: collision with root package name */
    public final String f11199z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b5(jk.g gVar, boolean z10) {
        super("ITEM_TYPE_DISCUSSION_HEADER_".concat(r9), 1);
        k71.k.g(gVar, "discussionDetailData");
        jk.f fVar = gVar.d;
        String str = fVar.a;
        lj.a aVar = gVar.b;
        le.h hVar = new le.h(aVar.b, aVar.a, fVar.c, null, gVar.h, gVar.i, gVar.j, str, fVar.b, true, gVar.A);
        DiscussionCategoryData discussionCategoryData = fVar.i;
        jk.b bVar = fVar.l;
        boolean z11 = gVar.u;
        b01.f fVar2 = fVar.q;
        k71.k.g(str, "discussionId");
        k71.k.g(discussionCategoryData, "category");
        k71.k.g(fVar2, "discussionClosedState");
        this.f11193t = hVar;
        this.f11194u = discussionCategoryData;
        this.f11195v = bVar;
        this.f11196w = z11;
        this.f11197x = z10;
        this.f11198y = fVar2;
        this.f11199z = discussionCategoryData.s;
        this.A = discussionCategoryData.t;
    }
}
