package com.github.rudroid.agents.sessionevents;

import com.github.rudroid.agents.sessionevents.j;
import com.github.rudroid.agents.sessionevents.k;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class b1 {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List f7498a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7499b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7500c;

    /* renamed from: d, reason: collision with root package name */
    public final v f7501d;

    /* renamed from: e, reason: collision with root package name */
    public final j f7502e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7503f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7504g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7505h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final k f7506j;

    /* renamed from: k, reason: collision with root package name */
    public final r4 f7507k;

    public static final class a {
        public static b1 a() {
            k.a aVar = new k.a(null, false, false);
            x61.r rVar = x61.r.r;
            return new b1(rVar, rVar, null, null, j.a.f7655a, false, false, null, null, aVar, null);
        }
    }

    public b1(List list, List list2, String str, v vVar, j jVar, boolean z10, boolean z11, String str2, String str3, k kVar, r4 r4Var) {
        this.f7498a = list;
        this.f7499b = list2;
        this.f7500c = str;
        this.f7501d = vVar;
        this.f7502e = jVar;
        this.f7503f = z10;
        this.f7504g = z11;
        this.f7505h = str2;
        this.i = str3;
        this.f7506j = kVar;
        this.f7507k = r4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return k71.k.b(this.f7498a, b1Var.f7498a) && k71.k.b(this.f7499b, b1Var.f7499b) && k71.k.b(this.f7500c, b1Var.f7500c) && k71.k.b(this.f7501d, b1Var.f7501d) && k71.k.b(this.f7502e, b1Var.f7502e) && this.f7503f == b1Var.f7503f && this.f7504g == b1Var.f7504g && k71.k.b(this.f7505h, b1Var.f7505h) && k71.k.b(this.i, b1Var.i) && k71.k.b(this.f7506j, b1Var.f7506j) && k71.k.b(this.f7507k, b1Var.f7507k);
    }

    public final int hashCode() {
        int c10 = f1.e.c(this.f7499b, this.f7498a.hashCode() * 31, 31);
        String str = this.f7500c;
        int hashCode = (c10 + (str == null ? 0 : str.hashCode())) * 31;
        v vVar = this.f7501d;
        int e5 = x.i.e(x.i.e((this.f7502e.hashCode() + ((hashCode + (vVar == null ? 0 : vVar.hashCode())) * 31)) * 31, 31, this.f7503f), 31, this.f7504g);
        String str2 = this.f7505h;
        int hashCode2 = (e5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode3 = (this.f7506j.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        r4 r4Var = this.f7507k;
        return hashCode3 + (r4Var != null ? r4Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionEventsUiModel(sessionBuckets=");
        sb2.append(this.f7498a);
        sb2.append(", trailingEvents=");
        sb2.append(this.f7499b);
        sb2.append(", activeSessionBucketId=");
        sb2.append(this.f7500c);
        sb2.append(", pullRequestAction=");
        sb2.append(this.f7501d);
        sb2.append(", inputBarState=");
        sb2.append(this.f7502e);
        sb2.append(", clearInputState=");
        sb2.append(this.f7503f);
        sb2.append(", hasPromptBeenSent=");
        com.github.rudroid.m0.z(sb2, this.f7504g, ", modelName=", this.f7505h, ", taskName=");
        sb2.append(this.i);
        sb2.append(", inputMode=");
        sb2.append(this.f7506j);
        sb2.append(", taskMetadata=");
        sb2.append(this.f7507k);
        sb2.append(")");
        return sb2.toString();
    }
}
