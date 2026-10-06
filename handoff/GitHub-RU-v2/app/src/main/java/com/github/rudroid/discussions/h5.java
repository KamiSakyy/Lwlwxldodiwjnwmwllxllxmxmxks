package com.github.rudroid.discussions;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class h5 extends za implements me.e, le.a {

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f11352t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11353u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11354v;

    /* renamed from: w, reason: collision with root package name */
    public String f11355w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(ArrayList arrayList, boolean z10, String str, boolean z11, int i) {
        super("ITEM_TYPE_DISCUSSION_REACTIONS_".concat(str), 4);
        z11 = (i & 8) != 0 ? false : z11;
        k71.k.g(str, "parentId");
        k71.k.g(str, "commentId");
        this.f11352t = arrayList;
        this.f11353u = z10;
        this.f11354v = z11;
        this.f11355w = str;
    }

    @Override // le.a
    public final String a() {
        return this.f11355w;
    }

    @Override // me.b
    public final boolean c() {
        return this.f11354v;
    }

    @Override // me.e
    public final boolean d() {
        return this.f11353u;
    }

    @Override // me.e
    public final List e() {
        return this.f11352t;
    }
}
