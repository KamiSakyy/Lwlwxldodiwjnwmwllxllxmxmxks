package com.github.rudroid.discussions;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.type.CommentAuthorAssociation;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes.dex */
public final class a5 extends za implements le.a {
    public String A;
    public String B;
    public ZonedDateTime C;
    public ZonedDateTime D;
    public boolean E;
    public yz0.z F;
    public boolean G;
    public yz0.x2 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public CommentAuthorAssociation L;

    /* renamed from: t, reason: collision with root package name */
    public String f11168t;

    /* renamed from: u, reason: collision with root package name */
    public String f11169u;

    /* renamed from: v, reason: collision with root package name */
    public String f11170v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11171w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11172x;

    /* renamed from: y, reason: collision with root package name */
    public String f11173y;

    /* renamed from: z, reason: collision with root package name */
    public Avatar f11174z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(String str, String str2, String str3, boolean z10, boolean z11, String str4, Avatar avatar, String str5, String str6, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, boolean z12, yz0.z zVar, boolean z13, yz0.x2 x2Var, boolean z14, boolean z15, boolean z16, CommentAuthorAssociation commentAuthorAssociation) {
        super("ITEM_TYPE_DISCUSSION_COMMENT_HEADER_".concat(str), 2);
        k71.k.g(str, "commentId");
        k71.k.g(str2, "discussionId");
        k71.k.g(str3, "bodyText");
        k71.k.g(str4, "commentUrl");
        k71.k.g(avatar, "avatar");
        k71.k.g(str5, "login");
        k71.k.g(str6, "authorId");
        k71.k.g(zonedDateTime, "createdAt");
        k71.k.g(x2Var, "minimizedState");
        k71.k.g(commentAuthorAssociation, "authorAssociation");
        this.f11168t = str;
        this.f11169u = str2;
        this.f11170v = str3;
        this.f11171w = z10;
        this.f11172x = z11;
        this.f11173y = str4;
        this.f11174z = avatar;
        this.A = str5;
        this.B = str6;
        this.C = zonedDateTime;
        this.D = zonedDateTime2;
        this.E = z12;
        this.F = zVar;
        this.G = z13;
        this.H = x2Var;
        this.I = z14;
        this.J = z15;
        this.K = z16;
        this.L = commentAuthorAssociation;
    }

    @Override // le.a
    public final String a() {
        return this.f11168t;
    }
}
