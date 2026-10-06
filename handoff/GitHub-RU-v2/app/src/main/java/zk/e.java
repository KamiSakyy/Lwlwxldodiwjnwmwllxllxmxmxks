package zk;

/* loaded from: /home/user/work/p/classes3.dex */
public class e {
    public oa.g a;

    public e(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    public final y71.y a(oa.j jVar, String str, String str2, Boolean bool, j71.c cVar) {
        k71.k.g(jVar, "user");
        k71.k.g(str, "parentIssueId");
        k71.k.g(str2, "subIssueId");
        return b31.b.J(((z01.h0) this.a.a(jVar)).o(bool, str, str2), jVar, cVar);
    }
}
