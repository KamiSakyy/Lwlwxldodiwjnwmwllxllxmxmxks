package ql;

import j71.c;
import java.io.File;
import k71.k;
import oa.g;
import oa.j;
import y71.y;
import z01.s;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public g a;

    public b(g gVar) {
        k.g(gVar, "service");
        this.a = gVar;
    }

    public final y a(j jVar, String str, String str2, String str3, String str4, File file, boolean z, c cVar) {
        k.g(str, "owner");
        k.g(str2, "repo");
        k.g(str3, "ref");
        k.g(str4, "path");
        return b31.b.J(((s) this.a.a(jVar)).a(str, str2, str3, str4, file, z), jVar, cVar);
    }


}
