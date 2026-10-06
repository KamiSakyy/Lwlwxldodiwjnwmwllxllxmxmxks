package com.github.rudroid.copilot;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f9484a;

        /* renamed from: b, reason: collision with root package name */
        public k91.a f9485b;

        public a(String str, k91.a aVar) {
            k71.k.g(str, "messageMarkdown");
            k71.k.g(aVar, "messageRootNode");
            this.f9484a = str;
            this.f9485b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k71.k.b(this.f9484a, aVar.f9484a) && k71.k.b(this.f9485b, aVar.f9485b);
        }

        public final int hashCode() {
            return this.f9485b.hashCode() + (this.f9484a.hashCode() * 31);
        }

        public final String toString() {
            return "AgentConfirmationMessage(messageMarkdown=" + this.f9484a + ", messageRootNode=" + this.f9485b + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public xn.r0 f9486a;

        /* renamed from: b, reason: collision with root package name */
        public xn.f0 f9487b;

        public b(xn.r0 r0Var, xn.f0 f0Var) {
            k71.k.g(r0Var, "errorType");
            k71.k.g(f0Var, "errorDescription");
            this.f9486a = r0Var;
            this.f9487b = f0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9486a == bVar.f9486a && k71.k.b(this.f9487b, bVar.f9487b);
        }

        public final int hashCode() {
            return this.f9487b.hashCode() + (this.f9486a.hashCode() * 31);
        }

        public final String toString() {
            return "ErrorBubble(errorType=" + this.f9486a + ", errorDescription=" + this.f9487b + ")";
        }
    }

    /* renamed from: com.github.rudroid.copilot.c$c, reason: collision with other inner class name */
    public static final class C0021c extends c {

        /* renamed from: a, reason: collision with root package name */
        public String f9488a;

        /* renamed from: b, reason: collision with root package name */
        public double f9489b;

        public C0021c(String str, double d10) {
            k71.k.g(str, "modelName");
            this.f9488a = str;
            this.f9489b = d10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0021c)) {
                return false;
            }
            C0021c c0021c = (C0021c) obj;
            return k71.k.b(this.f9488a, c0021c.f9488a) && Double.compare(this.f9489b, c0021c.f9489b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f9489b) + (this.f9488a.hashCode() * 31);
        }

        public final String toString() {
            return "ModelMultiplierWarning(modelName=" + this.f9488a + ", multiplier=" + this.f9489b + ")";
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f9490a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 2063361836;
        }

        public final String toString() {
            return "ThinkingBubble";
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public String f9491a;

        /* renamed from: b, reason: collision with root package name */
        public a f9492b;

        /* renamed from: c, reason: collision with root package name */
        public String f9493c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9494d;

        public e(String str, a aVar, String str2, boolean z10) {
            k71.k.g(str, "title");
            this.f9491a = str;
            this.f9492b = aVar;
            this.f9493c = str2;
            this.f9494d = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return k71.k.b(this.f9491a, eVar.f9491a) && k71.k.b(this.f9492b, eVar.f9492b) && k71.k.b(this.f9493c, eVar.f9493c) && this.f9494d == eVar.f9494d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f9494d) + h1.i((this.f9492b.hashCode() + (this.f9491a.hashCode() * 31)) * 31, this.f9493c, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UiAgentConfirmation(title=");
            sb2.append(this.f9491a);
            sb2.append(", message=");
            sb2.append(this.f9492b);
            sb2.append(", confirmation=");
            return com.github.rudroid.m0.k(sb2, this.f9493c, ", showActions=", this.f9494d, ")");
        }
    }

    public static final class f extends c {

        /* renamed from: a, reason: collision with root package name */
        public String f9495a;

        /* renamed from: b, reason: collision with root package name */
        public String f9496b;

        /* renamed from: c, reason: collision with root package name */
        public k91.a f9497c;

        /* renamed from: d, reason: collision with root package name */
        public xn.wShadow f9498d;

        /* renamed from: e, reason: collision with root package name */
        public ZonedDateTime f9499e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f9500f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f9501g;

        /* renamed from: h, reason: collision with root package name */
        public List f9502h;
        public List i;

        /* renamed from: j, reason: collision with root package name */
        public List f9503j;

        public f(String str, String str2, k91.a aVar, xn.wShadow wVar, ZonedDateTime zonedDateTime, boolean z10, boolean z11, List list, List list2, List list3) {
            k71.k.g(str, "id");
            k71.k.g(str2, "content");
            k71.k.g(aVar, "rootNode");
            k71.k.g(wVar, "state");
            k71.k.g(zonedDateTime, "createdAt");
            k71.k.g(list, "codeBlockVulnerabilities");
            k71.k.g(list2, "webSearchReferences");
            k71.k.g(list3, "agentConfirmations");
            this.f9495a = str;
            this.f9496b = str2;
            this.f9497c = aVar;
            this.f9498d = wVar;
            this.f9499e = zonedDateTime;
            this.f9500f = z10;
            this.f9501g = z11;
            this.f9502h = list;
            this.i = list2;
            this.f9503j = list3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return k71.k.b(this.f9495a, fVar.f9495a) && k71.k.b(this.f9496b, fVar.f9496b) && k71.k.b(this.f9497c, fVar.f9497c) && this.f9498d == fVar.f9498d && k71.k.b(this.f9499e, fVar.f9499e) && this.f9500f == fVar.f9500f && this.f9501g == fVar.f9501g && k71.k.b(this.f9502h, fVar.f9502h) && k71.k.b(this.i, fVar.i) && k71.k.b(this.f9503j, fVar.f9503j);
        }

        public final int hashCode() {
            return this.f9503j.hashCode() + f1.e.c(this.i, f1.e.c(this.f9502h, x.i.e(x.i.e(com.github.rudroid.m0.a(this.f9499e, (this.f9498d.hashCode() + ((this.f9497c.hashCode() + h1.i(this.f9495a.hashCode() * 31, this.f9496b, 31)) * 31)) * 31, 31), 31, this.f9500f), 31, this.f9501g), 31), 31);
        }

        public final String toString() {
            StringBuilder o5 = a0.s0.o("UiAssistantMessage(id=", this.f9495a, ", content=", this.f9496b, ", rootNode=");
            o5.append(this.f9497c);
            o5.append(", state=");
            o5.append(this.f9498d);
            o5.append(", createdAt=");
            com.github.rudroid.m0.v(", showFeedbackButtons=", ", showCreateAgentTaskButton=", o5, this.f9499e, this.f9500f);
            o5.append(this.f9501g);
            o5.append(", codeBlockVulnerabilities=");
            o5.append(this.f9502h);
            o5.append(", webSearchReferences=");
            o5.append(this.i);
            o5.append(", agentConfirmations=");
            o5.append(this.f9503j);
            o5.append(")");
            return o5.toString();
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public xn.c0 f9504a;

        public g(xn.c0 c0Var) {
            k71.k.g(c0Var, "state");
            this.f9504a = c0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f9504a == ((g) obj).f9504a;
        }

        public final int hashCode() {
            return this.f9504a.hashCode();
        }

        public final String toString() {
            return "UiClientConfirmation(state=" + this.f9504a + ")";
        }
    }

    public static final class h extends c {

        /* renamed from: a, reason: collision with root package name */
        public String f9505a;

        /* renamed from: b, reason: collision with root package name */
        public String f9506b;

        /* renamed from: c, reason: collision with root package name */
        public k91.a f9507c;

        /* renamed from: d, reason: collision with root package name */
        public ZonedDateTime f9508d;

        /* renamed from: e, reason: collision with root package name */
        public List f9509e;

        public h(String str, String str2, k91.a aVar, ZonedDateTime zonedDateTime, List list) {
            k71.k.g(str, "id");
            k71.k.g(str2, "content");
            k71.k.g(aVar, "rootNode");
            k71.k.g(zonedDateTime, "createdAt");
            this.f9505a = str;
            this.f9506b = str2;
            this.f9507c = aVar;
            this.f9508d = zonedDateTime;
            this.f9509e = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return k71.k.b(this.f9505a, hVar.f9505a) && k71.k.b(this.f9506b, hVar.f9506b) && k71.k.b(this.f9507c, hVar.f9507c) && k71.k.b(this.f9508d, hVar.f9508d) && k71.k.b(this.f9509e, hVar.f9509e);
        }

        public final int hashCode() {
            return this.f9509e.hashCode() + com.github.rudroid.m0.a(this.f9508d, (this.f9507c.hashCode() + h1.i(this.f9505a.hashCode() * 31, this.f9506b, 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder o5 = a0.s0.o("UiUserMessage(id=", this.f9505a, ", content=", this.f9506b, ", rootNode=");
            o5.append(this.f9507c);
            o5.append(", createdAt=");
            o5.append(this.f9508d);
            o5.append(", clientConfirmations=");
            return x.i.l(o5, this.f9509e, ")");
        }
    }

    public static final class i extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final i f9510a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1569856832;
        }

        public final String toString() {
            return "UnknownEvent";
        }
    }

    public static final class j extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final j f9511a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1574829845;
        }

        public final String toString() {
            return "WelcomeMessage";
        }
    }
    public Object v(Object p1) { return null; }
}
