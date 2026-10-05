package com.github.rudroid.discussions;

import com.github.domain.discussions.data.DiscussionCategoryData;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class w7 {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f11984a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11985b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11986c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11987d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11988e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11989f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11990g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11991h;
    public final ZonedDateTime i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11992j;

    /* renamed from: k, reason: collision with root package name */
    public final jk.b f11993k;
    public final yz0.b8 l;
    public final Object m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f11994n;

    /* renamed from: o, reason: collision with root package name */
    public final b01.f f11995o;

    public static final class a {
        /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
        public static w7 a(jk.f fVar) {
            k71.k.g(fVar, "discussion");
            String str = fVar.a;
            int i = fVar.b;
            DiscussionCategoryData discussionCategoryData = fVar.i;
            return new w7(str, i, discussionCategoryData.t, discussionCategoryData.s, fVar.c, fVar.d, fVar.e, fVar.k.intValue(), fVar.f, discussionCategoryData.u, fVar.l, fVar.n, fVar.o, fVar.p, fVar.q);
        }
    }

    public w7(String str, int i, String str2, String str3, String str4, String str5, String str6, int i10, ZonedDateTime zonedDateTime, boolean z10, jk.b bVar, yz0.b8 b8Var, List list, boolean z11, b01.f fVar) {
        k71.k.g(str2, "categoryEmojiHTML");
        k71.k.g(str3, "categoryTitle");
        this.f11984a = str;
        this.f11985b = i;
        this.f11986c = str2;
        this.f11987d = str3;
        this.f11988e = str4;
        this.f11989f = str5;
        this.f11990g = str6;
        this.f11991h = i10;
        this.i = zonedDateTime;
        this.f11992j = z10;
        this.f11993k = bVar;
        this.l = b8Var;
        this.m = list;
        this.f11994n = z11;
        this.f11995o = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        return this.f11984a.equals(w7Var.f11984a) && this.f11985b == w7Var.f11985b && k71.k.b(this.f11986c, w7Var.f11986c) && k71.k.b(this.f11987d, w7Var.f11987d) && this.f11988e.equals(w7Var.f11988e) && this.f11989f.equals(w7Var.f11989f) && this.f11990g.equals(w7Var.f11990g) && this.f11991h == w7Var.f11991h && this.i.equals(w7Var.i) && this.f11992j == w7Var.f11992j && k71.k.b(this.f11993k, w7Var.f11993k) && this.l.equals(w7Var.l) && this.m.equals(w7Var.m) && this.f11994n == w7Var.f11994n && this.f11995o.equals(w7Var.f11995o);
    }

    public final int hashCode() {
        int e5 = x.i.e(com.github.rudroid.m0.a(this.i, a0.s0.b(this.f11991h, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.f11985b, this.f11984a.hashCode() * 31, 31), this.f11986c, 31), this.f11987d, 31), this.f11988e, 31), this.f11989f, 31), this.f11990g, 31), 31), 31), 31, this.f11992j);
        jk.b bVar = this.f11993k;
        return this.f11995o.hashCode() + x.i.e(com.github.rudroid.copilot.h1.h((this.l.hashCode() + ((e5 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, this.m, 31), 31, this.f11994n);
    }

    public final String toString() {
        StringBuilder n10 = a0.s0.n(this.f11985b, "DiscussionsAdapterItem(id=", this.f11984a, ", number=", ", categoryEmojiHTML=");
        f1.e.x(n10, this.f11986c, ", categoryTitle=", this.f11987d, ", title=");
        f1.e.x(n10, this.f11988e, ", repositoryName=", this.f11989f, ", repositoryOwnerLogin=");
        a0.s0.w(this.f11991h, this.f11990g, ", commentCount=", ", updatedAt=", n10);
        com.github.rudroid.m0.v(", isAnswerable=", ", answer=", n10, this.i, this.f11992j);
        n10.append(this.f11993k);
        n10.append(", upvote=");
        n10.append(this.l);
        n10.append(", labels=");
        n10.append(this.m);
        n10.append(", isOrganizationDiscussion=");
        n10.append(this.f11994n);
        n10.append(", discussionClosedState=");
        n10.append(this.f11995o);
        n10.append(")");
        return n10.toString();
    }
}
