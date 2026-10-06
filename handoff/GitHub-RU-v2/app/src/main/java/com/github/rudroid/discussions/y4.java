package com.github.rudroid.discussions;

/* loaded from: /home/user/work/p/classes.dex */
public final class y4 extends za implements le.a {

    /* renamed from: t, reason: collision with root package name */
    public String f12032t;

    /* renamed from: u, reason: collision with root package name */
    public String f12033u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12034v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(String str, String str2, boolean z10) {
        super("ITEM_TYPE_ANSWER_HEADER", 9);
        k71.k.g(str, "commentId");
        k71.k.g(str2, "answerChosenByLogin");
        this.f12032t = str;
        this.f12033u = str2;
        this.f12034v = z10;
    }

    @Override // le.a
    public final String a() {
        return this.f12032t;
    }
}
