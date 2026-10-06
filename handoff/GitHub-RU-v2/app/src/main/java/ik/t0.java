package ik;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 {
    public oa.g a;
    public kk.e b;

    public t0(oa.g gVar, kk.e eVar) {
        k71.k.g(gVar, "discussionsService");
        k71.k.g(eVar, "discussionCommentDataMapper");
        this.a = gVar;
        this.b = eVar;
    }

    public final y71.y a(oa.j jVar, String str, String str2, j71.c cVar) {
        k71.k.g(str, "commentId");
        k71.k.g(str2, "commentBody");
        return b31.b.J(new a61.l0(((z01.n) this.a.a(jVar)).y(str, str2), this, 19), jVar, cVar);
    }
}
