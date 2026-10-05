package ik;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import yz0.k2;
import z01.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 {
    public final oa.g a;
    public final cn.a b;

    public l0(oa.g gVar, cn.a aVar) {
        k71.k.g(gVar, "service");
        k71.k.g(aVar, "timelineStore");
        this.a = gVar;
        this.b = aVar;
    }

    public final y71.y a(oa.j jVar, z01.i0 i0Var, String str, Set set, LinkedHashSet linkedHashSet, ProjectsMetaInfo projectsMetaInfo, j71.c cVar) {
        k71.k.g(i0Var, "labelable");
        k71.k.g(str, "labelableId");
        k71.k.g(set, "originalLabels");
        k71.k.g(linkedHashSet, "labels");
        n1 n1Var = (n1) this.a.a(jVar);
        ArrayList arrayList = new ArrayList(x61.n.F(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((k2) it.next()).getId());
        }
        return new y71.y(b31.b.J(n1Var.a(i0Var, str, arrayList, projectsMetaInfo), jVar, cVar), new an.d(this, jVar, str, set, linkedHashSet, (a71.c) null, 5), 6);
    }
}
