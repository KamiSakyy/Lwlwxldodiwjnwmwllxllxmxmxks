package com.github.rudroid.agents.sessionevents;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class r {

    public static final class a extends r {

        /* renamed from: a, reason: collision with root package name */
        public xn.i3 f7794a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f7795b;

        /* renamed from: c, reason: collision with root package name */
        public sy.s f7796c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7797d;

        public a(xn.i3 i3Var, boolean z10, sy.s sVar, boolean z11) {
            this.f7794a = i3Var;
            this.f7795b = z10;
            this.f7796c = sVar;
            this.f7797d = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k71.k.b(this.f7794a, aVar.f7794a) && this.f7795b == aVar.f7795b && k71.k.b(this.f7796c, aVar.f7796c) && this.f7797d == aVar.f7797d;
        }

        public final int hashCode() {
            int e5 = x.i.e(this.f7794a.hashCode() * 31, 31, this.f7795b);
            sy.s sVar = this.f7796c;
            return Boolean.hashCode(this.f7797d) + ((e5 + (sVar == null ? 0 : sVar.hashCode())) * 31);
        }

        public final String toString() {
            return "InteractivePrompt(event=" + this.f7794a + ", isResolved=" + this.f7795b + ", completionResponse=" + this.f7796c + ", isAutoApproved=" + this.f7797d + ")";
        }
    }

    public static final class b extends r {

        /* renamed from: a, reason: collision with root package name */
        public xn.i3 f7798a;

        public b(xn.i3 i3Var) {
            this.f7798a = i3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && k71.k.b(this.f7798a, ((b) obj).f7798a);
        }

        public final int hashCode() {
            return this.f7798a.hashCode();
        }

        public final String toString() {
            return "Message(event=" + this.f7798a + ")";
        }
    }

    public static final class c extends r {

        /* renamed from: a, reason: collision with root package name */
        public xn.i3 f7799a;

        /* renamed from: b, reason: collision with root package name */
        public String f7800b;

        /* renamed from: c, reason: collision with root package name */
        public String f7801c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7802d;

        /* renamed from: e, reason: collision with root package name */
        public String f7803e;

        public c(xn.i3 i3Var, String str, String str2, boolean z10, String str3) {
            k71.k.g(str, "messageId");
            this.f7799a = i3Var;
            this.f7800b = str;
            this.f7801c = str2;
            this.f7802d = z10;
            this.f7803e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k71.k.b(this.f7799a, cVar.f7799a) && k71.k.b(this.f7800b, cVar.f7800b) && k71.k.b(this.f7801c, cVar.f7801c) && this.f7802d == cVar.f7802d && k71.k.b(this.f7803e, cVar.f7803e);
        }

        public final int hashCode() {
            int e5 = x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.f7799a.hashCode() * 31, this.f7800b, 31), this.f7801c, 31), 31, this.f7802d);
            String str = this.f7803e;
            return e5 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PlanApprovalTag(event=");
            sb2.append(this.f7799a);
            sb2.append(", messageId=");
            sb2.append(this.f7800b);
            sb2.append(", planBody=");
            com.github.rudroid.m0.x(sb2, this.f7801c, ", isResolved=", this.f7802d, ", resolutionMarker=");
            return com.github.rudroid.copilot.h1.p(sb2, this.f7803e, ")");
        }
    }

    public static final class d extends r {

        /* renamed from: a, reason: collision with root package name */
        public xn.i3 f7804a;

        public d(xn.i3 i3Var) {
            this.f7804a = i3Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && k71.k.b(this.f7804a, ((d) obj).f7804a);
        }

        public final int hashCode() {
            return this.f7804a.hashCode();
        }

        public final String toString() {
            return "System(event=" + this.f7804a + ")";
        }
    }

    public static final class e extends r {

        /* renamed from: a, reason: collision with root package name */
        public List f7805a;

        public e(List list) {
            k71.k.g(list, "toolCalls");
            this.f7805a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && k71.k.b(this.f7805a, ((e) obj).f7805a);
        }

        public final int hashCode() {
            return this.f7805a.hashCode();
        }

        public final String toString() {
            return com.github.rudroid.m0.h("ToolGroup(toolCalls=", ")", this.f7805a);
        }
    }
}
