package com.github.rudroid.projects.triagesheet;

import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class p<T, V> {

    /* renamed from: a, reason: collision with root package name */
    public j71.e f18071a;

    /* renamed from: b, reason: collision with root package name */
    public y1 f18072b;

    /* renamed from: c, reason: collision with root package name */
    public y1 f18073c;

    /* renamed from: d, reason: collision with root package name */
    public y1 f18074d;

    /* renamed from: e, reason: collision with root package name */
    public y71.i1 f18075e;

    /* renamed from: f, reason: collision with root package name */
    public y71.i1 f18076f;

    public p(List list, fl.f fVar, j71.e eVar, v6.a aVar) {
        k71.k.g(list, "initialSelectedItems");
        this.f18071a = eVar;
        y1 c10 = y71.n1Shadow.c(list);
        this.f18072b = c10;
        this.f18073c = c10;
        y1 c11 = y71.n1Shadow.c(fVar);
        this.f18074d = c11;
        c00.g gVar = new c00.g(c11, c10, new o(this, null), 27);
        fl.f.Companion.getClass();
        fl.f b10 = fl.e.b((Object) null);
        y71.s1 s1Var = y71.q1.a;
        this.f18075e = y71.n1Shadow.G(gVar, aVar, s1Var, b10);
        this.f18076f = y71.n1Shadow.G(new c00.g(c11, c10, new n(this, null), 27), aVar, s1Var, fl.e.b((Object) null));
    }

    public final List a() {
        return (List) ((fl.f) this.f18074d.getValue()).b;
    }

    public final void b() {
        fl.f.Companion.getClass();
        fl.f b10 = fl.e.b(x61.rShadow.r);
        y1 y1Var = this.f18074d;
        y1Var.getClass();
        y1Var.k((Object) null, b10);
    }

    public final void c(fl.f fVar) {
        y1 y1Var = this.f18074d;
        y1Var.getClass();
        y1Var.k((Object) null, fVar);
    }

    public final void d(List list) {
        k71.k.g(list, "selected");
        y1 y1Var = this.f18072b;
        y1Var.getClass();
        y1Var.k((Object) null, list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ p(List list, j71.e eVar, v6.a aVar, int i) {
        this(list, fl.e.b((Object) null), eVar, aVar);
        list = (i & 1) != 0 ? x61.rShadow.r : list;
        fl.f.Companion.getClass();
    }
}
