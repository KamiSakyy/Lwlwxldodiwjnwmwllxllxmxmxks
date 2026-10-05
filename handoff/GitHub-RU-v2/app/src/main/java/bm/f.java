package bm;

import androidx.compose.ui.layout.k1;
import androidx.compose.ui.layout.l1;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.domain.searchandfilter.filters.data.DiscussionCategoryFilter;
import com.github.domain.searchandfilter.filters.data.OrganizationFilter;
import com.github.domain.searchandfilter.filters.data.ProjectFilter;
import com.github.domain.searchandfilter.filters.data.RepositoriesFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryOwnerRepositoriesFilter;
import com.github.service.models.response.LegacyProjectWithNumber;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.organizations.Organization;
import d3.c0;
import d3.z;
import java.util.ArrayList;
import java.util.List;
import l01.w0;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class f implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ ArrayList s;

    public /* synthetic */ f(int i, ArrayList arrayList) {
        this.r = i;
        this.s = arrayList;
    }

    public final Object k(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i = this.r;
        a0 a0Var = a0.a;
        int i2 = 0;
        ArrayList arrayList = this.s;
        switch (i) {
            case 0:
                t tVar = (t) obj;
                DiscussionCategoryFilter.Companion companion = DiscussionCategoryFilter.Companion;
                k71.k.g(tVar, "it");
                if (k71.k.b(tVar.b, "category")) {
                    Object obj2 = tVar.d;
                    if (obj2 instanceof DiscussionCategoryData) {
                        arrayList.add(obj2);
                        z = true;
                        break;
                    }
                }
                z = false;
            case 1:
                t tVar2 = (t) obj;
                OrganizationFilter.Companion companion2 = OrganizationFilter.Companion;
                k71.k.g(tVar2, "it");
                if (k71.k.b(tVar2.b, "user")) {
                    Object obj3 = tVar2.d;
                    if (obj3 instanceof Organization) {
                        arrayList.add(obj3);
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            case 2:
                t tVar3 = (t) obj;
                ProjectFilter.Companion companion3 = ProjectFilter.Companion;
                k71.k.g(tVar3, "it");
                if (k71.k.b(tVar3.b, "project")) {
                    Object obj4 = tVar3.d;
                    if (obj4 instanceof LegacyProjectWithNumber) {
                        arrayList.add(obj4);
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
            case 3:
                t tVar4 = (t) obj;
                k71.k.g(tVar4, "it");
                if (k71.k.b(tVar4.b, "project")) {
                    Object obj5 = tVar4.d;
                    if (obj5 instanceof w0) {
                        arrayList.add(obj5);
                        z4 = true;
                        break;
                    }
                }
                z4 = false;
            case 4:
                t tVar5 = (t) obj;
                RepositoriesFilter.Companion companion4 = RepositoriesFilter.Companion;
                k71.k.g(tVar5, "it");
                if (k71.k.b(tVar5.b, "repo")) {
                    Object obj6 = tVar5.d;
                    if (obj6 instanceof SimpleRepository) {
                        arrayList.add(obj6);
                        z5 = true;
                        break;
                    }
                }
                z5 = false;
            case 5:
                t tVar6 = (t) obj;
                RepositoryOwnerRepositoriesFilter.Companion companion5 = RepositoryOwnerRepositoriesFilter.Companion;
                k71.k.g(tVar6, "it");
                if (k71.k.b(tVar6.b, "repo")) {
                    Object obj7 = tVar6.d;
                    if (obj7 instanceof SimpleRepository) {
                        arrayList.add(obj7);
                        z6 = true;
                        break;
                    }
                }
                z6 = false;
            case 6:
                t71.l lVar = (t71.l) obj;
                k71.k.g(lVar, "filterMatch");
                String str = (String) lVar.a().get(1);
                String str2 = (String) lVar.a().get(2);
                String str3 = (String) lVar.a().get(3);
                k71.k.g(str3, "<this>");
                if (t71.w.F(str3, "\"", false) && t71.w.x(str3, "\"", false)) {
                    str3 = t71.p.b0(t71.p.a0(str3, "\""), "\"");
                }
                arrayList.add(new t(str, str2, str3, null));
                break;
            case 7:
                c0 c0Var = (c0) obj;
                k71.k.g(c0Var, "$this$semantics");
                z.h(c0Var, arrayList);
                break;
            case 8:
                k1 k1Var = (k1) obj;
                k71.k.g(k1Var, "$this$layout");
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj8 = arrayList.get(i3);
                    i3++;
                    k1Var.o((l1) obj8, 0, 0, 0.0f);
                }
                break;
            case 9:
                k1 k1Var2 = (k1) obj;
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    k1.j(k1Var2, (l1) arrayList.get(i4), 0, 0);
                }
                break;
            case 10:
                k1 k1Var3 = (k1) obj;
                int size3 = arrayList.size();
                int i5 = 0;
                while (i5 < size3) {
                    o0.f fVar = (o0.f) arrayList.get(i5);
                    List list = fVar.b;
                    boolean z7 = fVar.g;
                    if (fVar.k == Integer.MIN_VALUE) {
                        k0.b.a("position() should be called first");
                    }
                    int size4 = list.size();
                    int i6 = i2;
                    while (i6 < size4) {
                        l1 l1Var = (l1) list.get(i6);
                        ArrayList arrayList2 = arrayList;
                        int i7 = size3;
                        int i8 = i5;
                        long d = s3.j.d((r14[r15 + 1] & 4294967295L) | (fVar.i[i6 * 2] << 32), fVar.c);
                        if (z7) {
                            k1.y(k1Var3, l1Var, d);
                        } else {
                            k1.r(k1Var3, l1Var, d);
                        }
                        i6++;
                        size3 = i7;
                        i5 = i8;
                        arrayList = arrayList2;
                    }
                    i5++;
                    arrayList = arrayList;
                    i2 = 0;
                }
                break;
            default:
                k1 k1Var4 = (k1) obj;
                int size5 = arrayList.size();
                for (int i9 = 0; i9 < size5; i9++) {
                    k1.p(k1Var4, (l1) arrayList.get(i9), 0, 0);
                }
                break;
        }
        return a0Var;
    }
}
