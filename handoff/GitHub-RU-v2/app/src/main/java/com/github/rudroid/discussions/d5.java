package com.github.rudroid.discussions;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes.dex */
public final class d5 extends za implements le.a {

    /* renamed from: t, reason: collision with root package name */
    public final lj.a f11251t;

    /* renamed from: u, reason: collision with root package name */
    public final String f11252u;

    /* renamed from: v, reason: collision with root package name */
    public final ZonedDateTime f11253v;

    /* renamed from: w, reason: collision with root package name */
    public final String f11254w;

    /* renamed from: x, reason: collision with root package name */
    public final yz0.x2 f11255x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f11256y;

    /* renamed from: z, reason: collision with root package name */
    public final String f11257z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(lj.a aVar, String str, ZonedDateTime zonedDateTime, String str2, yz0.x2 x2Var, boolean z10, String str3) {
        super("ITEM_TYPE_INLINE_REPLIES_PREVIEW_ITEM_".concat(str3), 7);
        k71.k.g(str, "previewText");
        k71.k.g(str2, "parentCommentId");
        k71.k.g(str3, "previewCommentId");
        k71.k.g(str2, "commentId");
        this.f11251t = aVar;
        this.f11252u = str;
        this.f11253v = zonedDateTime;
        this.f11254w = str2;
        this.f11255x = x2Var;
        this.f11256y = z10;
        this.f11257z = str2;
    }

    @Override // le.a
    public final String a() {
        return this.f11257z;
    }
}
