package com.github.rudroid.agents.sessionevents;

import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public interface l {

    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public String f7688a;

        /* renamed from: b, reason: collision with root package name */
        public xn.g1 f7689b;

        /* renamed from: c, reason: collision with root package name */
        public Map f7690c;

        public a(String str, xn.g1 g1Var, Map map) {
            this.f7688a = str;
            this.f7689b = g1Var;
            this.f7690c = map;
        }

        @Override // com.github.rudroid.agents.sessionevents.l
        public final String c() {
            return this.f7688a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k71.k.b(this.f7688a, aVar.f7688a) && this.f7689b == aVar.f7689b && k71.k.b(this.f7690c, aVar.f7690c);
        }

        public final int hashCode() {
            int hashCode = (this.f7689b.hashCode() + (this.f7688a.hashCode() * 31)) * 31;
            Map map = this.f7690c;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        public final String toString() {
            return "ElicitationSubmit(promptId=" + this.f7688a + ", action=" + this.f7689b + ", content=" + this.f7690c + ")";
        }
    }

    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public String f7691a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f7692b;

        /* renamed from: c, reason: collision with root package name */
        public xn.z2 f7693c;

        public b(String str, boolean z10, xn.z2 z2Var) {
            this.f7691a = str;
            this.f7692b = z10;
            this.f7693c = z2Var;
        }

        @Override // com.github.rudroid.agents.sessionevents.l
        public final String c() {
            return this.f7691a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7691a.equals(bVar.f7691a) && this.f7692b == bVar.f7692b && this.f7693c == bVar.f7693c;
        }

        public final int hashCode() {
            return this.f7693c.hashCode() + x.i.e(this.f7691a.hashCode() * 31, 31, this.f7692b);
        }

        public final String toString() {
            StringBuilder o5 = com.github.rudroid.m0.o("Permission(promptId=", this.f7691a, ", approved=", ", scope=", this.f7692b);
            o5.append(this.f7693c);
            o5.append(")");
            return o5.toString();
        }
    }

    public interface c extends l {
    }

    public static final class d implements c, com.github.rudroid.agents.sessionevents.g {

        /* renamed from: a, reason: collision with root package name */
        public String f7694a;

        /* renamed from: b, reason: collision with root package name */
        public String f7695b;

        public d(String str, String str2) {
            this.f7694a = str;
            this.f7695b = str2;
        }

        @Override // com.github.rudroid.agents.sessionevents.g
        public final int a() {
            return 2131951743;
        }

        @Override // com.github.rudroid.agents.sessionevents.g
        public final l b(String str) {
            k71.k.g(str, "userInput");
            return new e(this.f7695b, false, false, null, null, str, 28);
        }

        @Override // com.github.rudroid.agents.sessionevents.l
        public final String c() {
            return this.f7695b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f7694a.equals(dVar.f7694a) && this.f7695b.equals(dVar.f7695b);
        }

        public final int hashCode() {
            return this.f7695b.hashCode() + a0.s0.b(2131951743, this.f7694a.hashCode() * 31, 31);
        }

        public final String toString() {
            return x.i.g("PlanApproveFeedback(question=", this.f7694a, ", labelId=2131951743, promptId=", this.f7695b, ")");
        }
    }

    public static final class e implements c {
        public static final a Companion = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f7696a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f7697b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7698c;

        /* renamed from: d, reason: collision with root package name */
        public String f7699d;

        /* renamed from: e, reason: collision with root package name */
        public Boolean f7700e;

        /* renamed from: f, reason: collision with root package name */
        public String f7701f;

        public static final class a {
        }

        public e(String str, boolean z10, boolean z11, String str2, Boolean bool, String str3, int i) {
            z11 = (i & 4) != 0 ? false : z11;
            str2 = (i & 8) != 0 ? null : str2;
            bool = (i & 16) != 0 ? null : bool;
            str3 = (i & 32) != 0 ? null : str3;
            this.f7696a = str;
            this.f7697b = z10;
            this.f7698c = z11;
            this.f7699d = str2;
            this.f7700e = bool;
            this.f7701f = str3;
        }

        @Override // com.github.rudroid.agents.sessionevents.l
        public final String c() {
            return this.f7696a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f7696a.equals(eVar.f7696a) && this.f7697b == eVar.f7697b && this.f7698c == eVar.f7698c && k71.k.b(this.f7699d, eVar.f7699d) && k71.k.b(this.f7700e, eVar.f7700e) && k71.k.b(this.f7701f, eVar.f7701f);
        }

        public final int hashCode() {
            int e5 = x.i.e(x.i.e(this.f7696a.hashCode() * 31, 31, this.f7697b), 31, this.f7698c);
            String str = this.f7699d;
            int hashCode = (e5 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f7700e;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.f7701f;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder o5 = com.github.rudroid.m0.o("PlanApproveOption(promptId=", this.f7696a, ", approved=", ", isRecommended=", this.f7697b);
            com.github.rudroid.m0.z(o5, this.f7698c, ", selectedAction=", this.f7699d, ", autoApproveEdits=");
            o5.append(this.f7700e);
            o5.append(", feedback=");
            o5.append(this.f7701f);
            o5.append(")");
            return o5.toString();
        }
    }

    public static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public String f7702a;

        /* renamed from: b, reason: collision with root package name */
        public String f7703b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7704c;

        /* renamed from: d, reason: collision with root package name */
        public String f7705d;

        public f(String str, String str2, boolean z10) {
            k71.k.g(str, "messageId");
            this.f7702a = str;
            this.f7703b = str2;
            this.f7704c = z10;
            this.f7705d = "msg:".concat(str);
        }

        @Override // com.github.rudroid.agents.sessionevents.l
        public final String c() {
            return this.f7705d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return k71.k.b(this.f7702a, fVar.f7702a) && this.f7703b.equals(fVar.f7703b) && this.f7704c == fVar.f7704c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f7704c) + com.github.rudroid.copilot.h1.i(this.f7702a.hashCode() * 31, this.f7703b, 31);
        }

        public final String toString() {
            return jo.f4Shadow.s(a0.s0.o("PlanApproveTagOption(messageId=", this.f7702a, ", planBody=", this.f7703b, ", approved="), this.f7704c, ")");
        }
    }

    public interface g extends l {
    }

    public static final class h implements g, com.github.rudroid.agents.sessionevents.g {

        /* renamed from: a, reason: collision with root package name */
        public String f7706a;

        /* renamed from: b, reason: collision with root package name */
        public String f7707b;

        public h(String str, String str2) {
            this.f7706a = str;
            this.f7707b = str2;
        }

        @Override // com.github.rudroid.agents.sessionevents.g
        public final int a() {
            return 2131951764;
        }

        @Override // com.github.rudroid.agents.sessionevents.g
        public final l b(String str) {
            k71.k.g(str, "userInput");
            return new i(this.f7707b, str, true);
        }

        @Override // com.github.rudroid.agents.sessionevents.l
        public final String c() {
            return this.f7707b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f7706a.equals(hVar.f7706a) && this.f7707b.equals(hVar.f7707b);
        }

        public final int hashCode() {
            return this.f7707b.hashCode() + a0.s0.b(2131951764, this.f7706a.hashCode() * 31, 31);
        }

        public final String toString() {
            return x.i.g("UserAskFreeform(question=", this.f7706a, ", labelId=2131951764, promptId=", this.f7707b, ")");
        }
    }

    public static final class i implements g {

        /* renamed from: a, reason: collision with root package name */
        public String f7708a;

        /* renamed from: b, reason: collision with root package name */
        public String f7709b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7710c;

        public i(String str, String str2, boolean z10) {
            k71.k.g(str2, "answer");
            this.f7708a = str;
            this.f7709b = str2;
            this.f7710c = z10;
        }

        @Override // com.github.rudroid.agents.sessionevents.l
        public final String c() {
            return this.f7708a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f7708a.equals(iVar.f7708a) && k71.k.b(this.f7709b, iVar.f7709b) && this.f7710c == iVar.f7710c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f7710c) + com.github.rudroid.copilot.h1.i(this.f7708a.hashCode() * 31, this.f7709b, 31);
        }

        public final String toString() {
            return jo.f4Shadow.s(a0.s0.o("UserAskOption(promptId=", this.f7708a, ", answer=", this.f7709b, ", wasFreeform="), this.f7710c, ")");
        }
    }

    String c();
}
