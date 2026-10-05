package com.github.rudroid.projects;

import com.github.rudroid.issueorpullrequest.triagesheet.b;
import com.github.service.models.response.projects.ProjectFieldType;
import com.github.service.models.response.projects.ProjectV2Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class j0 {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17728a;

        static {
            int[] iArr = new int[ProjectFieldType.values().length];
            try {
                iArr[ProjectFieldType.ASSIGNEES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProjectFieldType.LINKED_PULL_REQUESTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProjectFieldType.LABELS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProjectFieldType.MILESTONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProjectFieldType.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProjectFieldType.SINGLE_SELECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProjectFieldType.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProjectFieldType.DATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProjectFieldType.ITERATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProjectFieldType.REVIEWERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProjectFieldType.REPOSITORY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProjectFieldType.TITLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProjectFieldType.TRACKS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ProjectFieldType.UNKNOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f17728a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0244 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(Map map, Map map2, List list, String str, boolean z10, l01.x xVar) {
        x61.r r10;
        ArrayList arrayList;
        ArrayList arrayList2;
        com.github.service.models.response.projects.a c0046a;
        com.github.service.models.response.projects.a iVar;
        com.github.service.models.response.projects.a aVar;
        l01.x xVar2 = xVar;
        k71.k.g(map2, "fieldValues");
        List list2 = list;
        k71.k.g(list2, "viewGroupedByFields");
        List r11 = x61.l.r(new ProjectFieldType[]{ProjectFieldType.SINGLE_SELECT, ProjectFieldType.ITERATION, ProjectFieldType.DATE, ProjectFieldType.NUMBER, ProjectFieldType.TEXT});
        if (xVar2 == null) {
            r10 = x61.r.r;
        } else if (xVar2 instanceof l01.u0) {
            r10 = x61.l.r(new ProjectFieldType[]{ProjectFieldType.LABELS, ProjectFieldType.ASSIGNEES, ProjectFieldType.MILESTONE});
        } else {
            if (!(xVar2 instanceof l01.r)) {
                throw new NoWhenBranchMatchedException();
            }
            r10 = x61.l.r(new ProjectFieldType[]{ProjectFieldType.LABELS, ProjectFieldType.ASSIGNEES, ProjectFieldType.MILESTONE, ProjectFieldType.LINKED_PULL_REQUESTS});
        }
        ArrayList l02 = x61.m.l0(r11, r10);
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (l02.contains(((l01.j0) entry.getValue()).l())) {
                ProjectV2Field.ProjectV2IterationField projectV2IterationField = (l01.j0) entry.getValue();
                String id2 = projectV2IterationField.getId();
                k71.k.g(id2, "id");
                com.github.service.models.response.projects.a aVar2 = (l01.d0) map2.get(new l01.y(id2));
                switch (a.f17728a[projectV2IterationField.l().ordinal()]) {
                    case 1:
                        arrayList = l02;
                        arrayList2 = arrayList3;
                        r6 = aVar2 instanceof l01.q ? (l01.q) aVar2 : null;
                        if (xVar == null) {
                            r6 = b.f.a.j.f16315a;
                            if (r6 == null) {
                                arrayList2.add(r6);
                            }
                            list2 = list;
                            xVar2 = xVar;
                            l02 = arrayList;
                            arrayList3 = arrayList2;
                        } else {
                            c0046a = new b.f.a.C0046a(projectV2IterationField.getId(), projectV2IterationField.getName(), projectV2IterationField.l(), list, str, xVar.d() && z10, xVar, r6);
                            r6 = c0046a;
                            if (r6 == null) {
                            }
                            list2 = list;
                            xVar2 = xVar;
                            l02 = arrayList;
                            arrayList3 = arrayList2;
                        }
                    case 2:
                        arrayList = l02;
                        arrayList2 = arrayList3;
                        com.github.service.models.response.projects.a aVar3 = aVar2 instanceof l01.j ? (l01.j) aVar2 : null;
                        if (xVar == null) {
                            r6 = b.f.a.j.f16315a;
                            if (r6 == null) {
                            }
                            list2 = list;
                            xVar2 = xVar;
                            l02 = arrayList;
                            arrayList3 = arrayList2;
                        } else {
                            c0046a = new b.f.a.e(projectV2IterationField.getId(), projectV2IterationField.getName(), projectV2IterationField.l(), list, str, xVar.m(), xVar, aVar3);
                            r6 = c0046a;
                            if (r6 == null) {
                            }
                            list2 = list;
                            xVar2 = xVar;
                            l02 = arrayList;
                            arrayList3 = arrayList2;
                        }
                        break;
                    case 3:
                        arrayList = l02;
                        arrayList2 = arrayList3;
                        r6 = aVar2 instanceof l01.f ? (l01.f) aVar2 : null;
                        if (xVar == null) {
                            r6 = b.f.a.j.f16315a;
                            if (r6 == null) {
                            }
                            list2 = list;
                            xVar2 = xVar;
                            l02 = arrayList;
                            arrayList3 = arrayList2;
                        } else {
                            c0046a = new b.f.a.d(projectV2IterationField.getId(), projectV2IterationField.getName(), projectV2IterationField.l(), list, str, xVar.e() && z10, xVar, r6);
                            r6 = c0046a;
                            if (r6 == null) {
                            }
                            list2 = list;
                            xVar2 = xVar;
                            l02 = arrayList;
                            arrayList3 = arrayList2;
                        }
                        break;
                    case 4:
                        com.github.service.models.response.projects.a aVar4 = aVar2 instanceof l01.g ? (l01.g) aVar2 : null;
                        if (xVar2 == null) {
                            r6 = b.f.a.j.f16315a;
                            break;
                        } else {
                            arrayList = l02;
                            arrayList2 = arrayList3;
                            c0046a = new b.f.a.C0048f(projectV2IterationField.getId(), projectV2IterationField.getName(), projectV2IterationField.l(), list, str, xVar2.m(), xVar2, aVar4);
                            r6 = c0046a;
                            if (r6 == null) {
                            }
                            list2 = list;
                            xVar2 = xVar;
                            l02 = arrayList;
                            arrayList3 = arrayList2;
                        }
                        break;
                    case 5:
                        iVar = new b.f.a.i(projectV2IterationField.getId(), projectV2IterationField.getName(), projectV2IterationField.l(), aVar2 instanceof l01.o ? (l01.o) aVar2 : null, list, str, z10);
                        arrayList = l02;
                        arrayList2 = arrayList3;
                        r6 = iVar;
                        if (r6 == null) {
                        }
                        list2 = list;
                        xVar2 = xVar;
                        l02 = arrayList;
                        arrayList3 = arrayList2;
                        break;
                    case 6:
                        ProjectV2Field.ProjectV2SingleSelectField projectV2SingleSelectField = projectV2IterationField instanceof ProjectV2Field.ProjectV2SingleSelectField ? (ProjectV2Field.ProjectV2SingleSelectField) projectV2IterationField : null;
                        if (projectV2SingleSelectField != null) {
                            iVar = new b.f.a.h(projectV2SingleSelectField.r, projectV2SingleSelectField.t, projectV2SingleSelectField.u, aVar2 instanceof com.github.service.models.response.projects.b ? (com.github.service.models.response.projects.b) aVar2 : null, ((ProjectV2Field.ProjectV2SingleSelectField) projectV2IterationField).v, list, str, z10);
                            arrayList = l02;
                            arrayList2 = arrayList3;
                            r6 = iVar;
                            if (r6 == null) {
                            }
                            list2 = list;
                            xVar2 = xVar;
                            l02 = arrayList;
                            arrayList3 = arrayList2;
                        } else {
                            aVar = b.f.a.j.f16315a;
                            arrayList = l02;
                            arrayList2 = arrayList3;
                            r6 = aVar;
                            if (r6 == null) {
                            }
                            list2 = list;
                            xVar2 = xVar;
                            l02 = arrayList;
                            arrayList3 = arrayList2;
                        }
                        break;
                    case 7:
                        iVar = new b.f.a.g(projectV2IterationField.getId(), projectV2IterationField.getName(), projectV2IterationField.l(), aVar2 instanceof l01.i ? (l01.i) aVar2 : null, list, str, z10);
                        arrayList = l02;
                        arrayList2 = arrayList3;
                        r6 = iVar;
                        if (r6 == null) {
                        }
                        list2 = list;
                        xVar2 = xVar;
                        l02 = arrayList;
                        arrayList3 = arrayList2;
                        break;
                    case 8:
                        iVar = new b.f.a.C0047b(projectV2IterationField.getId(), projectV2IterationField.getName(), projectV2IterationField.l(), aVar2 instanceof l01.d ? (l01.d) aVar2 : null, list, str, z10);
                        arrayList = l02;
                        arrayList2 = arrayList3;
                        r6 = iVar;
                        if (r6 == null) {
                        }
                        list2 = list;
                        xVar2 = xVar;
                        l02 = arrayList;
                        arrayList3 = arrayList2;
                        break;
                    case 9:
                        ProjectV2Field.ProjectV2IterationField projectV2IterationField2 = projectV2IterationField instanceof ProjectV2Field.ProjectV2IterationField ? projectV2IterationField : null;
                        if (projectV2IterationField2 != null) {
                            ProjectV2Field.ProjectV2IterationField projectV2IterationField3 = projectV2IterationField;
                            iVar = new b.f.a.c(projectV2IterationField2.r, projectV2IterationField2.t, projectV2IterationField2.u, aVar2 instanceof com.github.service.models.response.projects.a ? aVar2 : null, x61.m.l0(projectV2IterationField3.w, projectV2IterationField3.v), list2, str, z10);
                            arrayList = l02;
                            arrayList2 = arrayList3;
                            r6 = iVar;
                            if (r6 == null) {
                            }
                            list2 = list;
                            xVar2 = xVar;
                            l02 = arrayList;
                            arrayList3 = arrayList2;
                        } else {
                            aVar = b.f.a.j.f16315a;
                            arrayList = l02;
                            arrayList2 = arrayList3;
                            r6 = aVar;
                            if (r6 == null) {
                            }
                            list2 = list;
                            xVar2 = xVar;
                            l02 = arrayList;
                            arrayList3 = arrayList2;
                        }
                        break;
                    case 10:
                    case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                    case 13:
                    case 14:
                        aVar = b.f.a.j.f16315a;
                        arrayList = l02;
                        arrayList2 = arrayList3;
                        r6 = aVar;
                        if (r6 == null) {
                        }
                        list2 = list;
                        xVar2 = xVar;
                        l02 = arrayList;
                        arrayList3 = arrayList2;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            arrayList = l02;
            arrayList2 = arrayList3;
            if (r6 == null) {
            }
            list2 = list;
            xVar2 = xVar;
            l02 = arrayList;
            arrayList3 = arrayList2;
        }
        return arrayList3;
    }
}
