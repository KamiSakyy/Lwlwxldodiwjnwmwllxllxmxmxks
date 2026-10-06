package com.github.rudroid.issueorpullrequest.triagesheet;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.projects.ProjectFieldType;
import java.util.ArrayList;
import java.util.List;
import jo.f4;
import le.z;
import yz0.o2;
import yz0.v2;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b implements z {
    public static final a Companion = new a();

    /* renamed from: r, reason: collision with root package name */
    public final String f16239r;

    public static final class a {
    }

    /* renamed from: com.github.rudroid.issueorpullrequest.triagesheet.b$b, reason: collision with other inner class name */
    public static final class C0045b extends b {

        /* renamed from: s, reason: collision with root package name */
        public final IssueType f16240s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0045b(IssueType issueType) {
            super(f1.e.g("ITEM_TYPE_ISSUE_TYPE", issueType.r));
            k71.k.g(issueType, "issueType");
            this.f16240s = issueType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0045b) && k71.k.b(this.f16240s, ((C0045b) obj).f16240s);
        }

        public final int hashCode() {
            return this.f16240s.hashCode();
        }

        public final String toString() {
            return "IssueTypeSectionPill(issueType=" + this.f16240s + ")";
        }
    }

    public static final class c extends b {

        /* renamed from: s, reason: collision with root package name */
        public final xz0.f f16241s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xz0.f fVar) {
            super(f1.e.g("ITEM_TYPE_LEGACY_PROJECT", fVar.a.s));
            k71.k.g(fVar, "projectInfoCard");
            this.f16241s = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && k71.k.b(this.f16241s, ((c) obj).f16241s);
        }

        public final int hashCode() {
            return this.f16241s.hashCode();
        }

        public final String toString() {
            return "LegacyProjectSectionCard(projectInfoCard=" + this.f16241s + ")";
        }
    }

    public static final class d extends b {

        /* renamed from: s, reason: collision with root package name */
        public final v2 f16242s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v2 v2Var) {
            super(f1.e.g("ITEM_TYPE_MILESTONE", v2Var.getId()));
            k71.k.g(v2Var, "milestone");
            this.f16242s = v2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && k71.k.b(this.f16242s, ((d) obj).f16242s);
        }

        public final int hashCode() {
            return this.f16242s.hashCode();
        }

        public final String toString() {
            return "MilestoneSectionCard(milestone=" + this.f16242s + ")";
        }
    }

    public static final class e extends b {

        /* renamed from: s, reason: collision with root package name */
        public final h01.j f16243s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h01.j jVar) {
            super("ITEM_TYPE_PARENT_ISSUE");
            k71.k.g(jVar, "parentIssueData");
            this.f16243s = jVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && k71.k.b(this.f16243s, ((e) obj).f16243s);
        }

        public final int hashCode() {
            return this.f16243s.hashCode();
        }

        public final String toString() {
            return "ParentIssue(parentIssueData=" + this.f16243s + ")";
        }
    }

    public static final class f extends b {

        /* renamed from: s, reason: collision with root package name */
        public final l01.s f16244s;

        /* renamed from: t, reason: collision with root package name */
        public final List f16245t;

        public interface a {

            /* renamed from: com.github.rudroid.issueorpullrequest.triagesheet.b$f$a$a, reason: collision with other inner class name */
            public static final class C0046a implements a {

                /* renamed from: a, reason: collision with root package name */
                public final String f16246a;

                /* renamed from: b, reason: collision with root package name */
                public final String f16247b;

                /* renamed from: c, reason: collision with root package name */
                public final ProjectFieldType f16248c;

                /* renamed from: d, reason: collision with root package name */
                public final List f16249d;

                /* renamed from: e, reason: collision with root package name */
                public final String f16250e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f16251f;

                /* renamed from: g, reason: collision with root package name */
                public final l01.x f16252g;

                /* renamed from: h, reason: collision with root package name */
                public final l01.q f16253h;

                public C0046a(String str, String str2, ProjectFieldType projectFieldType, List list, String str3, boolean z10, l01.x xVar, l01.q qVar) {
                    k71.k.g(str, "fieldId");
                    k71.k.g(str2, "fieldName");
                    k71.k.g(projectFieldType, "dataType");
                    k71.k.g(list, "viewGroupedByFields");
                    k71.k.g(xVar, "associatedContent");
                    this.f16246a = str;
                    this.f16247b = str2;
                    this.f16248c = projectFieldType;
                    this.f16249d = list;
                    this.f16250e = str3;
                    this.f16251f = z10;
                    this.f16252g = xVar;
                    this.f16253h = qVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0046a)) {
                        return false;
                    }
                    C0046a c0046a = (C0046a) obj;
                    return k71.k.b(this.f16246a, c0046a.f16246a) && k71.k.b(this.f16247b, c0046a.f16247b) && this.f16248c == c0046a.f16248c && k71.k.b(this.f16249d, c0046a.f16249d) && k71.k.b(this.f16250e, c0046a.f16250e) && this.f16251f == c0046a.f16251f && k71.k.b(this.f16252g, c0046a.f16252g) && k71.k.b(this.f16253h, c0046a.f16253h);
                }

                public final int hashCode() {
                    int c10 = f1.e.c(this.f16249d, (this.f16248c.hashCode() + h1.i(this.f16246a.hashCode() * 31, this.f16247b, 31)) * 31, 31);
                    String str = this.f16250e;
                    int hashCode = (this.f16252g.hashCode() + x.i.e((c10 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f16251f)) * 31;
                    l01.q qVar = this.f16253h;
                    return hashCode + (qVar != null ? qVar.hashCode() : 0);
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final ProjectFieldType l() {
                    return this.f16248c;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final boolean m() {
                    return this.f16251f;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String n() {
                    return this.f16246a;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String o() {
                    return this.f16247b;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String p() {
                    return this.f16250e;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final List q() {
                    return this.f16249d;
                }

                public final String toString() {
                    StringBuilder o5 = s0.o("FieldAssigneesRow(fieldId=", this.f16246a, ", fieldName=", this.f16247b, ", dataType=");
                    o5.append(this.f16248c);
                    o5.append(", viewGroupedByFields=");
                    o5.append(this.f16249d);
                    o5.append(", viewId=");
                    m0.x(o5, this.f16250e, ", viewerCanUpdate=", this.f16251f, ", associatedContent=");
                    o5.append(this.f16252g);
                    o5.append(", value=");
                    o5.append(this.f16253h);
                    o5.append(")");
                    return o5.toString();
                }
            }

            /* renamed from: com.github.rudroid.issueorpullrequest.triagesheet.b$f$a$b, reason: collision with other inner class name */
            public static final class C0047b implements a {

                /* renamed from: a, reason: collision with root package name */
                public final String f16254a;

                /* renamed from: b, reason: collision with root package name */
                public final String f16255b;

                /* renamed from: c, reason: collision with root package name */
                public final ProjectFieldType f16256c;

                /* renamed from: d, reason: collision with root package name */
                public final l01.d f16257d;

                /* renamed from: e, reason: collision with root package name */
                public final List f16258e;

                /* renamed from: f, reason: collision with root package name */
                public final String f16259f;

                /* renamed from: g, reason: collision with root package name */
                public final boolean f16260g;

                public C0047b(String str, String str2, ProjectFieldType projectFieldType, l01.d dVar, List list, String str3, boolean z10) {
                    k71.k.g(str, "fieldId");
                    k71.k.g(str2, "fieldName");
                    k71.k.g(projectFieldType, "dataType");
                    k71.k.g(list, "viewGroupedByFields");
                    this.f16254a = str;
                    this.f16255b = str2;
                    this.f16256c = projectFieldType;
                    this.f16257d = dVar;
                    this.f16258e = list;
                    this.f16259f = str3;
                    this.f16260g = z10;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0047b)) {
                        return false;
                    }
                    C0047b c0047b = (C0047b) obj;
                    return k71.k.b(this.f16254a, c0047b.f16254a) && k71.k.b(this.f16255b, c0047b.f16255b) && this.f16256c == c0047b.f16256c && k71.k.b(this.f16257d, c0047b.f16257d) && k71.k.b(this.f16258e, c0047b.f16258e) && k71.k.b(this.f16259f, c0047b.f16259f) && this.f16260g == c0047b.f16260g;
                }

                public final int hashCode() {
                    int hashCode = (this.f16256c.hashCode() + h1.i(this.f16254a.hashCode() * 31, this.f16255b, 31)) * 31;
                    l01.d dVar = this.f16257d;
                    int c10 = f1.e.c(this.f16258e, (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
                    String str = this.f16259f;
                    return Boolean.hashCode(this.f16260g) + ((c10 + (str != null ? str.hashCode() : 0)) * 31);
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final ProjectFieldType l() {
                    return this.f16256c;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final boolean m() {
                    return this.f16260g;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String n() {
                    return this.f16254a;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String o() {
                    return this.f16255b;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String p() {
                    return this.f16259f;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final List q() {
                    return this.f16258e;
                }

                public final String toString() {
                    StringBuilder o5 = s0.o("FieldDateRow(fieldId=", this.f16254a, ", fieldName=", this.f16255b, ", dataType=");
                    o5.append(this.f16256c);
                    o5.append(", value=");
                    o5.append(this.f16257d);
                    o5.append(", viewGroupedByFields=");
                    o5.append(this.f16258e);
                    o5.append(", viewId=");
                    o5.append(this.f16259f);
                    o5.append(", viewerCanUpdate=");
                    return f4.s(o5, this.f16260g, ")");
                }
            }

            public static final class c implements a {

                /* renamed from: a, reason: collision with root package name */
                public final String f16261a;

                /* renamed from: b, reason: collision with root package name */
                public final String f16262b;

                /* renamed from: c, reason: collision with root package name */
                public final ProjectFieldType f16263c;

                /* renamed from: d, reason: collision with root package name */
                public final com.github.service.models.response.projects.a f16264d;

                /* renamed from: e, reason: collision with root package name */
                public final ArrayList f16265e;

                /* renamed from: f, reason: collision with root package name */
                public final List f16266f;

                /* renamed from: g, reason: collision with root package name */
                public final String f16267g;

                /* renamed from: h, reason: collision with root package name */
                public final boolean f16268h;

                public c(String str, String str2, ProjectFieldType projectFieldType, com.github.service.models.response.projects.a aVar, ArrayList arrayList, List list, String str3, boolean z10) {
                    k71.k.g(str, "fieldId");
                    k71.k.g(str2, "fieldName");
                    k71.k.g(projectFieldType, "dataType");
                    k71.k.g(list, "viewGroupedByFields");
                    this.f16261a = str;
                    this.f16262b = str2;
                    this.f16263c = projectFieldType;
                    this.f16264d = aVar;
                    this.f16265e = arrayList;
                    this.f16266f = list;
                    this.f16267g = str3;
                    this.f16268h = z10;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return k71.k.b(this.f16261a, cVar.f16261a) && k71.k.b(this.f16262b, cVar.f16262b) && this.f16263c == cVar.f16263c && k71.k.b(this.f16264d, cVar.f16264d) && this.f16265e.equals(cVar.f16265e) && k71.k.b(this.f16266f, cVar.f16266f) && k71.k.b(this.f16267g, cVar.f16267g) && this.f16268h == cVar.f16268h;
                }

                public final int hashCode() {
                    int hashCode = (this.f16263c.hashCode() + h1.i(this.f16261a.hashCode() * 31, this.f16262b, 31)) * 31;
                    com.github.service.models.response.projects.a aVar = this.f16264d;
                    int c10 = f1.e.c(this.f16266f, no.a.b(this.f16265e, (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31);
                    String str = this.f16267g;
                    return Boolean.hashCode(this.f16268h) + ((c10 + (str != null ? str.hashCode() : 0)) * 31);
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final ProjectFieldType l() {
                    return this.f16263c;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final boolean m() {
                    return this.f16268h;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String n() {
                    return this.f16261a;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String o() {
                    return this.f16262b;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String p() {
                    return this.f16267g;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final List q() {
                    return this.f16266f;
                }

                public final String toString() {
                    StringBuilder o5 = s0.o("FieldIterationRow(fieldId=", this.f16261a, ", fieldName=", this.f16262b, ", dataType=");
                    o5.append(this.f16263c);
                    o5.append(", value=");
                    o5.append(this.f16264d);
                    o5.append(", availableIterations=");
                    o5.append(this.f16265e);
                    o5.append(", viewGroupedByFields=");
                    o5.append(this.f16266f);
                    o5.append(", viewId=");
                    return m0.k(o5, this.f16267g, ", viewerCanUpdate=", this.f16268h, ")");
                }
            }

            public static final class d implements a {

                /* renamed from: a, reason: collision with root package name */
                public final String f16269a;

                /* renamed from: b, reason: collision with root package name */
                public final String f16270b;

                /* renamed from: c, reason: collision with root package name */
                public final ProjectFieldType f16271c;

                /* renamed from: d, reason: collision with root package name */
                public final List f16272d;

                /* renamed from: e, reason: collision with root package name */
                public final String f16273e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f16274f;

                /* renamed from: g, reason: collision with root package name */
                public final l01.x f16275g;

                /* renamed from: h, reason: collision with root package name */
                public final l01.f f16276h;

                public d(String str, String str2, ProjectFieldType projectFieldType, List list, String str3, boolean z10, l01.x xVar, l01.f fVar) {
                    k71.k.g(str, "fieldId");
                    k71.k.g(str2, "fieldName");
                    k71.k.g(projectFieldType, "dataType");
                    k71.k.g(list, "viewGroupedByFields");
                    k71.k.g(xVar, "associatedContent");
                    this.f16269a = str;
                    this.f16270b = str2;
                    this.f16271c = projectFieldType;
                    this.f16272d = list;
                    this.f16273e = str3;
                    this.f16274f = z10;
                    this.f16275g = xVar;
                    this.f16276h = fVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return k71.k.b(this.f16269a, dVar.f16269a) && k71.k.b(this.f16270b, dVar.f16270b) && this.f16271c == dVar.f16271c && k71.k.b(this.f16272d, dVar.f16272d) && k71.k.b(this.f16273e, dVar.f16273e) && this.f16274f == dVar.f16274f && k71.k.b(this.f16275g, dVar.f16275g) && k71.k.b(this.f16276h, dVar.f16276h);
                }

                public final int hashCode() {
                    int c10 = f1.e.c(this.f16272d, (this.f16271c.hashCode() + h1.i(this.f16269a.hashCode() * 31, this.f16270b, 31)) * 31, 31);
                    String str = this.f16273e;
                    int hashCode = (this.f16275g.hashCode() + x.i.e((c10 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f16274f)) * 31;
                    l01.f fVar = this.f16276h;
                    return hashCode + (fVar != null ? fVar.hashCode() : 0);
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final ProjectFieldType l() {
                    return this.f16271c;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final boolean m() {
                    return this.f16274f;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String n() {
                    return this.f16269a;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String o() {
                    return this.f16270b;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String p() {
                    return this.f16273e;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final List q() {
                    return this.f16272d;
                }

                public final String toString() {
                    StringBuilder o5 = s0.o("FieldLabelsRow(fieldId=", this.f16269a, ", fieldName=", this.f16270b, ", dataType=");
                    o5.append(this.f16271c);
                    o5.append(", viewGroupedByFields=");
                    o5.append(this.f16272d);
                    o5.append(", viewId=");
                    m0.x(o5, this.f16273e, ", viewerCanUpdate=", this.f16274f, ", associatedContent=");
                    o5.append(this.f16275g);
                    o5.append(", value=");
                    o5.append(this.f16276h);
                    o5.append(")");
                    return o5.toString();
                }
            }

            public static final class e implements a {

                /* renamed from: a, reason: collision with root package name */
                public final String f16277a;

                /* renamed from: b, reason: collision with root package name */
                public final String f16278b;

                /* renamed from: c, reason: collision with root package name */
                public final ProjectFieldType f16279c;

                /* renamed from: d, reason: collision with root package name */
                public final List f16280d;

                /* renamed from: e, reason: collision with root package name */
                public final String f16281e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f16282f;

                /* renamed from: g, reason: collision with root package name */
                public final l01.x f16283g;

                /* renamed from: h, reason: collision with root package name */
                public final l01.j f16284h;

                public e(String str, String str2, ProjectFieldType projectFieldType, List list, String str3, boolean z10, l01.x xVar, l01.j jVar) {
                    k71.k.g(str, "fieldId");
                    k71.k.g(str2, "fieldName");
                    k71.k.g(projectFieldType, "dataType");
                    k71.k.g(list, "viewGroupedByFields");
                    k71.k.g(xVar, "associatedContent");
                    this.f16277a = str;
                    this.f16278b = str2;
                    this.f16279c = projectFieldType;
                    this.f16280d = list;
                    this.f16281e = str3;
                    this.f16282f = z10;
                    this.f16283g = xVar;
                    this.f16284h = jVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return k71.k.b(this.f16277a, eVar.f16277a) && k71.k.b(this.f16278b, eVar.f16278b) && this.f16279c == eVar.f16279c && k71.k.b(this.f16280d, eVar.f16280d) && k71.k.b(this.f16281e, eVar.f16281e) && this.f16282f == eVar.f16282f && k71.k.b(this.f16283g, eVar.f16283g) && k71.k.b(this.f16284h, eVar.f16284h);
                }

                public final int hashCode() {
                    int c10 = f1.e.c(this.f16280d, (this.f16279c.hashCode() + h1.i(this.f16277a.hashCode() * 31, this.f16278b, 31)) * 31, 31);
                    String str = this.f16281e;
                    int hashCode = (this.f16283g.hashCode() + x.i.e((c10 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f16282f)) * 31;
                    l01.j jVar = this.f16284h;
                    return hashCode + (jVar != null ? jVar.hashCode() : 0);
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final ProjectFieldType l() {
                    return this.f16279c;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final boolean m() {
                    return this.f16282f;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String n() {
                    return this.f16277a;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String o() {
                    return this.f16278b;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String p() {
                    return this.f16281e;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final List q() {
                    return this.f16280d;
                }

                public final String toString() {
                    StringBuilder o5 = s0.o("FieldLinkedPullRequestsRow(fieldId=", this.f16277a, ", fieldName=", this.f16278b, ", dataType=");
                    o5.append(this.f16279c);
                    o5.append(", viewGroupedByFields=");
                    o5.append(this.f16280d);
                    o5.append(", viewId=");
                    m0.x(o5, this.f16281e, ", viewerCanUpdate=", this.f16282f, ", associatedContent=");
                    o5.append(this.f16283g);
                    o5.append(", value=");
                    o5.append(this.f16284h);
                    o5.append(")");
                    return o5.toString();
                }
            }

            /* renamed from: com.github.rudroid.issueorpullrequest.triagesheet.b$f$a$f, reason: collision with other inner class name */
            public static final class C0048f implements a {

                /* renamed from: a, reason: collision with root package name */
                public final String f16285a;

                /* renamed from: b, reason: collision with root package name */
                public final String f16286b;

                /* renamed from: c, reason: collision with root package name */
                public final ProjectFieldType f16287c;

                /* renamed from: d, reason: collision with root package name */
                public final List f16288d;

                /* renamed from: e, reason: collision with root package name */
                public final String f16289e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f16290f;

                /* renamed from: g, reason: collision with root package name */
                public final l01.x f16291g;

                /* renamed from: h, reason: collision with root package name */
                public final l01.g f16292h;

                public C0048f(String str, String str2, ProjectFieldType projectFieldType, List list, String str3, boolean z10, l01.x xVar, l01.g gVar) {
                    k71.k.g(str, "fieldId");
                    k71.k.g(str2, "fieldName");
                    k71.k.g(projectFieldType, "dataType");
                    k71.k.g(list, "viewGroupedByFields");
                    k71.k.g(xVar, "associatedContent");
                    this.f16285a = str;
                    this.f16286b = str2;
                    this.f16287c = projectFieldType;
                    this.f16288d = list;
                    this.f16289e = str3;
                    this.f16290f = z10;
                    this.f16291g = xVar;
                    this.f16292h = gVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0048f)) {
                        return false;
                    }
                    C0048f c0048f = (C0048f) obj;
                    return k71.k.b(this.f16285a, c0048f.f16285a) && k71.k.b(this.f16286b, c0048f.f16286b) && this.f16287c == c0048f.f16287c && k71.k.b(this.f16288d, c0048f.f16288d) && k71.k.b(this.f16289e, c0048f.f16289e) && this.f16290f == c0048f.f16290f && k71.k.b(this.f16291g, c0048f.f16291g) && k71.k.b(this.f16292h, c0048f.f16292h);
                }

                public final int hashCode() {
                    int c10 = f1.e.c(this.f16288d, (this.f16287c.hashCode() + h1.i(this.f16285a.hashCode() * 31, this.f16286b, 31)) * 31, 31);
                    String str = this.f16289e;
                    int hashCode = (this.f16291g.hashCode() + x.i.e((c10 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f16290f)) * 31;
                    l01.g gVar = this.f16292h;
                    return hashCode + (gVar != null ? gVar.hashCode() : 0);
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final ProjectFieldType l() {
                    return this.f16287c;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final boolean m() {
                    return this.f16290f;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String n() {
                    return this.f16285a;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String o() {
                    return this.f16286b;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String p() {
                    return this.f16289e;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final List q() {
                    return this.f16288d;
                }

                public final String toString() {
                    StringBuilder o5 = s0.o("FieldMilestoneRow(fieldId=", this.f16285a, ", fieldName=", this.f16286b, ", dataType=");
                    o5.append(this.f16287c);
                    o5.append(", viewGroupedByFields=");
                    o5.append(this.f16288d);
                    o5.append(", viewId=");
                    m0.x(o5, this.f16289e, ", viewerCanUpdate=", this.f16290f, ", associatedContent=");
                    o5.append(this.f16291g);
                    o5.append(", value=");
                    o5.append(this.f16292h);
                    o5.append(")");
                    return o5.toString();
                }
            }

            public static final class g implements a {

                /* renamed from: a, reason: collision with root package name */
                public final String f16293a;

                /* renamed from: b, reason: collision with root package name */
                public final String f16294b;

                /* renamed from: c, reason: collision with root package name */
                public final ProjectFieldType f16295c;

                /* renamed from: d, reason: collision with root package name */
                public final l01.i f16296d;

                /* renamed from: e, reason: collision with root package name */
                public final List f16297e;

                /* renamed from: f, reason: collision with root package name */
                public final String f16298f;

                /* renamed from: g, reason: collision with root package name */
                public final boolean f16299g;

                public g(String str, String str2, ProjectFieldType projectFieldType, l01.i iVar, List list, String str3, boolean z10) {
                    k71.k.g(str, "fieldId");
                    k71.k.g(str2, "fieldName");
                    k71.k.g(projectFieldType, "dataType");
                    k71.k.g(list, "viewGroupedByFields");
                    this.f16293a = str;
                    this.f16294b = str2;
                    this.f16295c = projectFieldType;
                    this.f16296d = iVar;
                    this.f16297e = list;
                    this.f16298f = str3;
                    this.f16299g = z10;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof g)) {
                        return false;
                    }
                    g gVar = (g) obj;
                    return k71.k.b(this.f16293a, gVar.f16293a) && k71.k.b(this.f16294b, gVar.f16294b) && this.f16295c == gVar.f16295c && k71.k.b(this.f16296d, gVar.f16296d) && k71.k.b(this.f16297e, gVar.f16297e) && k71.k.b(this.f16298f, gVar.f16298f) && this.f16299g == gVar.f16299g;
                }

                public final int hashCode() {
                    int hashCode = (this.f16295c.hashCode() + h1.i(this.f16293a.hashCode() * 31, this.f16294b, 31)) * 31;
                    l01.i iVar = this.f16296d;
                    int c10 = f1.e.c(this.f16297e, (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31, 31);
                    String str = this.f16298f;
                    return Boolean.hashCode(this.f16299g) + ((c10 + (str != null ? str.hashCode() : 0)) * 31);
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final ProjectFieldType l() {
                    return this.f16295c;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final boolean m() {
                    return this.f16299g;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String n() {
                    return this.f16293a;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String o() {
                    return this.f16294b;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String p() {
                    return this.f16298f;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final List q() {
                    return this.f16297e;
                }

                public final String toString() {
                    StringBuilder o5 = s0.o("FieldNumberRow(fieldId=", this.f16293a, ", fieldName=", this.f16294b, ", dataType=");
                    o5.append(this.f16295c);
                    o5.append(", value=");
                    o5.append(this.f16296d);
                    o5.append(", viewGroupedByFields=");
                    o5.append(this.f16297e);
                    o5.append(", viewId=");
                    o5.append(this.f16298f);
                    o5.append(", viewerCanUpdate=");
                    return f4.s(o5, this.f16299g, ")");
                }
            }

            public static final class h implements a {

                /* renamed from: a, reason: collision with root package name */
                public final String f16300a;

                /* renamed from: b, reason: collision with root package name */
                public final String f16301b;

                /* renamed from: c, reason: collision with root package name */
                public final ProjectFieldType f16302c;

                /* renamed from: d, reason: collision with root package name */
                public final com.github.service.models.response.projects.b f16303d;

                /* renamed from: e, reason: collision with root package name */
                public final List f16304e;

                /* renamed from: f, reason: collision with root package name */
                public final List f16305f;

                /* renamed from: g, reason: collision with root package name */
                public final String f16306g;

                /* renamed from: h, reason: collision with root package name */
                public final boolean f16307h;

                public h(String str, String str2, ProjectFieldType projectFieldType, com.github.service.models.response.projects.b bVar, List list, List list2, String str3, boolean z10) {
                    k71.k.g(str, "fieldId");
                    k71.k.g(str2, "fieldName");
                    k71.k.g(projectFieldType, "dataType");
                    k71.k.g(list, "availableOptions");
                    k71.k.g(list2, "viewGroupedByFields");
                    this.f16300a = str;
                    this.f16301b = str2;
                    this.f16302c = projectFieldType;
                    this.f16303d = bVar;
                    this.f16304e = list;
                    this.f16305f = list2;
                    this.f16306g = str3;
                    this.f16307h = z10;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof h)) {
                        return false;
                    }
                    h hVar = (h) obj;
                    return k71.k.b(this.f16300a, hVar.f16300a) && k71.k.b(this.f16301b, hVar.f16301b) && this.f16302c == hVar.f16302c && k71.k.b(this.f16303d, hVar.f16303d) && k71.k.b(this.f16304e, hVar.f16304e) && k71.k.b(this.f16305f, hVar.f16305f) && k71.k.b(this.f16306g, hVar.f16306g) && this.f16307h == hVar.f16307h;
                }

                public final int hashCode() {
                    int hashCode = (this.f16302c.hashCode() + h1.i(this.f16300a.hashCode() * 31, this.f16301b, 31)) * 31;
                    com.github.service.models.response.projects.b bVar = this.f16303d;
                    int c10 = f1.e.c(this.f16305f, f1.e.c(this.f16304e, (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31), 31);
                    String str = this.f16306g;
                    return Boolean.hashCode(this.f16307h) + ((c10 + (str != null ? str.hashCode() : 0)) * 31);
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final ProjectFieldType l() {
                    return this.f16302c;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final boolean m() {
                    return this.f16307h;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String n() {
                    return this.f16300a;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String o() {
                    return this.f16301b;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String p() {
                    return this.f16306g;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final List q() {
                    return this.f16305f;
                }

                public final String toString() {
                    StringBuilder o5 = s0.o("FieldSingleOptionRow(fieldId=", this.f16300a, ", fieldName=", this.f16301b, ", dataType=");
                    o5.append(this.f16302c);
                    o5.append(", value=");
                    o5.append(this.f16303d);
                    o5.append(", availableOptions=");
                    o5.append(this.f16304e);
                    o5.append(", viewGroupedByFields=");
                    o5.append(this.f16305f);
                    o5.append(", viewId=");
                    return m0.k(o5, this.f16306g, ", viewerCanUpdate=", this.f16307h, ")");
                }
            }

            public static final class i implements a {

                /* renamed from: a, reason: collision with root package name */
                public final String f16308a;

                /* renamed from: b, reason: collision with root package name */
                public final String f16309b;

                /* renamed from: c, reason: collision with root package name */
                public final ProjectFieldType f16310c;

                /* renamed from: d, reason: collision with root package name */
                public final l01.o f16311d;

                /* renamed from: e, reason: collision with root package name */
                public final List f16312e;

                /* renamed from: f, reason: collision with root package name */
                public final String f16313f;

                /* renamed from: g, reason: collision with root package name */
                public final boolean f16314g;

                public i(String str, String str2, ProjectFieldType projectFieldType, l01.o oVar, List list, String str3, boolean z10) {
                    k71.k.g(str, "fieldId");
                    k71.k.g(str2, "fieldName");
                    k71.k.g(projectFieldType, "dataType");
                    k71.k.g(list, "viewGroupedByFields");
                    this.f16308a = str;
                    this.f16309b = str2;
                    this.f16310c = projectFieldType;
                    this.f16311d = oVar;
                    this.f16312e = list;
                    this.f16313f = str3;
                    this.f16314g = z10;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof i)) {
                        return false;
                    }
                    i iVar = (i) obj;
                    return k71.k.b(this.f16308a, iVar.f16308a) && k71.k.b(this.f16309b, iVar.f16309b) && this.f16310c == iVar.f16310c && k71.k.b(this.f16311d, iVar.f16311d) && k71.k.b(this.f16312e, iVar.f16312e) && k71.k.b(this.f16313f, iVar.f16313f) && this.f16314g == iVar.f16314g;
                }

                public final int hashCode() {
                    int hashCode = (this.f16310c.hashCode() + h1.i(this.f16308a.hashCode() * 31, this.f16309b, 31)) * 31;
                    l01.o oVar = this.f16311d;
                    int c10 = f1.e.c(this.f16312e, (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31, 31);
                    String str = this.f16313f;
                    return Boolean.hashCode(this.f16314g) + ((c10 + (str != null ? str.hashCode() : 0)) * 31);
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final ProjectFieldType l() {
                    return this.f16310c;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final boolean m() {
                    return this.f16314g;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String n() {
                    return this.f16308a;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String o() {
                    return this.f16309b;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String p() {
                    return this.f16313f;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final List q() {
                    return this.f16312e;
                }

                public final String toString() {
                    StringBuilder o5 = s0.o("FieldTextRow(fieldId=", this.f16308a, ", fieldName=", this.f16309b, ", dataType=");
                    o5.append(this.f16310c);
                    o5.append(", value=");
                    o5.append(this.f16311d);
                    o5.append(", viewGroupedByFields=");
                    o5.append(this.f16312e);
                    o5.append(", viewId=");
                    o5.append(this.f16313f);
                    o5.append(", viewerCanUpdate=");
                    return f4.s(o5, this.f16314g, ")");
                }
            }

            public static final class j implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final j f16315a = new j();

                /* renamed from: b, reason: collision with root package name */
                public static final ProjectFieldType f16316b = ProjectFieldType.UNKNOWN;

                /* renamed from: c, reason: collision with root package name */
                public static final x61.r f16317c = x61.r.r;

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final ProjectFieldType l() {
                    return f16316b;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final boolean m() {
                    return false;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String n() {
                    return "";
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String o() {
                    return "";
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final String p() {
                    return null;
                }

                @Override // com.github.rudroid.issueorpullrequest.triagesheet.b.f.a
                public final List q() {
                    return f16317c;
                }
            }

            ProjectFieldType l();

            boolean m();

            String n();

            String o();

            String p();

            List q();
        }

        public f(l01.s sVar, List list) {
            super(f1.e.g("ITEM_TYPE_PROJECT", sVar.r.r));
            this.f16244s = sVar;
            this.f16245t = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return k71.k.b(this.f16244s, fVar.f16244s) && k71.k.b(this.f16245t, fVar.f16245t);
        }

        public final int hashCode() {
            return this.f16245t.hashCode() + (this.f16244s.hashCode() * 31);
        }

        public final String toString() {
            return "ProjectSectionCard(itemInfo=" + this.f16244s + ", fieldRow=" + this.f16245t + ")";
        }
    }

    public static final class g extends b {

        /* renamed from: s, reason: collision with root package name */
        public final yz0.f f16318s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(yz0.f fVar) {
            super(f1.e.g("ITEM_TYPE_ASSIGNEE", fVar.getId()));
            k71.k.g(fVar, "assignee");
            this.f16318s = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && k71.k.b(this.f16318s, ((g) obj).f16318s);
        }

        public final int hashCode() {
            return this.f16318s.hashCode();
        }

        public final String toString() {
            return "SectionAssignees(assignee=" + this.f16318s + ")";
        }
    }

    public static final class h extends b {

        /* renamed from: s, reason: collision with root package name */
        public final int f16319s;

        public h(int i) {
            super(no.a.k("ITEM_TYPE_SECTION_EMPTY", i));
            this.f16319s = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f16319s == ((h) obj).f16319s;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16319s);
        }

        public final String toString() {
            return s0.i("SectionEmptyItem(emptyStateTitle=", this.f16319s, ")");
        }
    }

    public static final class i extends b {

        /* renamed from: s, reason: collision with root package name */
        public final int f16320s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f16321t;

        /* renamed from: u, reason: collision with root package name */
        public final p f16322u;

        public i(int i, boolean z10, p pVar) {
            super(no.a.k("ITEM_TYPE_SECTION_HEADER", i));
            this.f16320s = i;
            this.f16321t = z10;
            this.f16322u = pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f16320s == iVar.f16320s && this.f16321t == iVar.f16321t && this.f16322u == iVar.f16322u;
        }

        public final int hashCode() {
            return this.f16322u.hashCode() + x.i.e(Integer.hashCode(this.f16320s) * 31, 31, this.f16321t);
        }

        public final String toString() {
            return "SectionHeaderItem(titleRes=" + this.f16320s + ", isEditable=" + this.f16321t + ", section=" + this.f16322u + ")";
        }
    }

    public static final class j extends b {

        /* renamed from: s, reason: collision with root package name */
        public final Object f16323s;

        public j(List list) {
            super("ITEM_TYPE_LABELS");
            this.f16323s = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f16323s.equals(((j) obj).f16323s);
        }

        public final int hashCode() {
            return this.f16323s.hashCode();
        }

        public final String toString() {
            return h1.l(this.f16323s, "SectionLabels(labels=", ")");
        }
    }

    public static final class k extends b {

        /* renamed from: s, reason: collision with root package name */
        public final o2 f16324s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(o2 o2Var) {
            super(s0.i("ITEM_TYPE_LINKED_ISSUE_OR_PULL_REQUEST", o2Var.b(), o2Var.a()));
            k71.k.g(o2Var, "linkedItem");
            this.f16324s = o2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && k71.k.b(this.f16324s, ((k) obj).f16324s);
        }

        public final int hashCode() {
            return this.f16324s.hashCode();
        }

        public final String toString() {
            return "SectionLinkedIssuesOrPullRequest(linkedItem=" + this.f16324s + ")";
        }
    }

    public static final class l extends b {

        /* renamed from: s, reason: collision with root package name */
        public final int f16325s;

        public l(int i) {
            super(no.a.k("ITEM_TYPE_SEPARATOR", i));
            this.f16325s = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f16325s == ((l) obj).f16325s;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16325s);
        }

        public final String toString() {
            return s0.i("Separator(titleRes=", this.f16325s, ")");
        }
    }

    public b(String str) {
        this.f16239r = str;
    }

    @Override // le.z
    public final String E() {
        return this.f16239r;
    }
}
