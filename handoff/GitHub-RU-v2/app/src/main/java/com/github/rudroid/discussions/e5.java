package com.github.rudroid.discussions;

/* loaded from: /home/user/work/p/classes.dex */
public final class e5 extends za implements le.a {

    /* renamed from: t, reason: collision with root package name */
    public final int f11282t;

    /* renamed from: u, reason: collision with root package name */
    public final String f11283u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(String str, int i) {
        super("ITEM_TYPE_INLINE_REPLIES_PREVIEW_METADATA_".concat(str), 6);
        k71.k.g(str, "commentId");
        this.f11282t = i;
        this.f11283u = str;
    }

    @Override // le.a
    public final String a() {
        return this.f11283u;
    }
}
