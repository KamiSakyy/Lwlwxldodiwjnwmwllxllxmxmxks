package com.github.rudroid.discussions;

/* loaded from: /home/user/work/p/classes.dex */
public final class c5 extends za implements le.a {

    /* renamed from: t, reason: collision with root package name */
    public int f11223t;

    /* renamed from: u, reason: collision with root package name */
    public String f11224u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11225v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(int i, String str, boolean z10) {
        super("ITEM_TYPE_INLINE_REPLIES_PREVIEW_".concat(str), 5);
        k71.k.g(str, "commentId");
        this.f11223t = i;
        this.f11224u = str;
        this.f11225v = z10;
    }

    @Override // le.a
    public final String a() {
        return this.f11224u;
    }
}
