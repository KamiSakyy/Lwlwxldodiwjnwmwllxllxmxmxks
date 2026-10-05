package com.github.rudroid.agents.sessionevents;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b0 {

    public static final class a extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f7356a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7357b;

        /* renamed from: c, reason: collision with root package name */
        public final k91.a f7358c;

        /* renamed from: d, reason: collision with root package name */
        public final Instant f7359d;

        /* renamed from: e, reason: collision with root package name */
        public final String f7360e;

        public a(String str, String str2, k91.a aVar, Instant instant, String str3) {
            k71.k.g(str, "id");
            k71.k.g(str2, "content");
            k71.k.g(aVar, "rootNode");
            this.f7356a = str;
            this.f7357b = str2;
            this.f7358c = aVar;
            this.f7359d = instant;
            this.f7360e = str3;
        }

        @Override // com.github.rudroid.agents.sessionevents.b0
        public final String a() {
            return this.f7356a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k71.k.b(this.f7356a, aVar.f7356a) && k71.k.b(this.f7357b, aVar.f7357b) && k71.k.b(this.f7358c, aVar.f7358c) && k71.k.b(this.f7359d, aVar.f7359d) && k71.k.b(this.f7360e, aVar.f7360e);
        }

        public final int hashCode() {
            int hashCode = (this.f7359d.hashCode() + ((this.f7358c.hashCode() + com.github.rudroid.copilot.h1.i(this.f7356a.hashCode() * 31, this.f7357b, 31)) * 31)) * 31;
            String str = this.f7360e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder o5 = a0.s0.o("AssistantResponse(id=", this.f7356a, ", content=", this.f7357b, ", rootNode=");
            o5.append(this.f7358c);
            o5.append(", timestamp=");
            o5.append(this.f7359d);
            o5.append(", reasoningText=");
            return com.github.rudroid.copilot.h1.p(o5, this.f7360e, ")");
        }
    }

    public static final class b extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f7361a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7362b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f7363c;

        /* renamed from: d, reason: collision with root package name */
        public final k91.a f7364d;

        /* renamed from: e, reason: collision with root package name */
        public final Instant f7365e;

        public b(String str, String str2, Integer num, k91.a aVar, Instant instant) {
            k71.k.g(str, "id");
            k71.k.g(aVar, "rootNode");
            this.f7361a = str;
            this.f7362b = str2;
            this.f7363c = num;
            this.f7364d = aVar;
            this.f7365e = instant;
        }

        @Override // com.github.rudroid.agents.sessionevents.b0
        public final String a() {
            return this.f7361a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k71.k.b(this.f7361a, bVar.f7361a) && k71.k.b(this.f7362b, bVar.f7362b) && k71.k.b(this.f7363c, bVar.f7363c) && k71.k.b(this.f7364d, bVar.f7364d) && k71.k.b(this.f7365e, bVar.f7365e);
        }

        public final int hashCode() {
            int hashCode = this.f7361a.hashCode() * 31;
            String str = this.f7362b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f7363c;
            return this.f7365e.hashCode() + ((this.f7364d.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder o5 = a0.s0.o("ErrorEvent(id=", this.f7361a, ", message=", this.f7362b, ", defaultMessageResId=");
            o5.append(this.f7363c);
            o5.append(", rootNode=");
            o5.append(this.f7364d);
            o5.append(", timestamp=");
            o5.append(this.f7365e);
            o5.append(")");
            return o5.toString();
        }
    }

    public static final class c extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f7366a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f7367b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7368c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7369d;

        /* renamed from: e, reason: collision with root package name */
        public final int f7370e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f7371f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f7372g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f7373h;
        public final Instant i;

        public c(String str, ArrayList arrayList, int i, int i10, int i11, ArrayList arrayList2, boolean z10, boolean z11, Instant instant) {
            k71.k.g(str, "id");
            this.f7366a = str;
            this.f7367b = arrayList;
            this.f7368c = i;
            this.f7369d = i10;
            this.f7370e = i11;
            this.f7371f = arrayList2;
            this.f7372g = z10;
            this.f7373h = z11;
            this.i = instant;
        }

        @Override // com.github.rudroid.agents.sessionevents.b0
        public final String a() {
            return this.f7366a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k71.k.b(this.f7366a, cVar.f7366a) && this.f7367b.equals(cVar.f7367b) && this.f7368c == cVar.f7368c && this.f7369d == cVar.f7369d && this.f7370e == cVar.f7370e && this.f7371f.equals(cVar.f7371f) && this.f7372g == cVar.f7372g && this.f7373h == cVar.f7373h && this.i.equals(cVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + x.i.e(x.i.e(x.i.e(no.a.b(this.f7371f, a0.s0.b(this.f7370e, a0.s0.b(this.f7369d, a0.s0.b(this.f7368c, no.a.b(this.f7367b, this.f7366a.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.f7372g), 31, this.f7373h), 31, true);
        }

        public final String toString() {
            StringBuilder p3 = com.github.rudroid.m0.p("FilesChanged(id=", this.f7366a, ", files=", this.f7367b, ", totalAdditions=");
            a0.s0.z(p3, this.f7368c, ", totalDeletions=", this.f7369d, ", totalFilesChanged=");
            p3.append(this.f7370e);
            p3.append(", diffData=");
            p3.append(this.f7371f);
            p3.append(", hasMoreFiles=");
            com.github.rudroid.m0.A(p3, this.f7372g, ", canLoadNextPage=", this.f7373h, ", isEnabled=true, timestamp=");
            p3.append(this.i);
            p3.append(")");
            return p3.toString();
        }
    }

    public static final class d extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f7374a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7375b;

        /* renamed from: c, reason: collision with root package name */
        public final k91.a f7376c;

        /* renamed from: d, reason: collision with root package name */
        public final Instant f7377d;

        public d(String str, String str2, k91.a aVar, Instant instant) {
            k71.k.g(str, "id");
            k71.k.g(str2, "intent");
            k71.k.g(aVar, "rootNode");
            this.f7374a = str;
            this.f7375b = str2;
            this.f7376c = aVar;
            this.f7377d = instant;
        }

        @Override // com.github.rudroid.agents.sessionevents.b0
        public final String a() {
            return this.f7374a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return k71.k.b(this.f7374a, dVar.f7374a) && k71.k.b(this.f7375b, dVar.f7375b) && k71.k.b(this.f7376c, dVar.f7376c) && k71.k.b(this.f7377d, dVar.f7377d);
        }

        public final int hashCode() {
            return this.f7377d.hashCode() + ((this.f7376c.hashCode() + com.github.rudroid.copilot.h1.i(this.f7374a.hashCode() * 31, this.f7375b, 31)) * 31);
        }

        public final String toString() {
            StringBuilder o5 = a0.s0.o("IntentUpdate(id=", this.f7374a, ", intent=", this.f7375b, ", rootNode=");
            o5.append(this.f7376c);
            o5.append(", timestamp=");
            o5.append(this.f7377d);
            o5.append(")");
            return o5.toString();
        }
    }

    public static final class f extends b0 {
        @Override // com.github.rudroid.agents.sessionevents.b0
        public final String a() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "PullRequestProposal(id=null, prTitle=null, prBody=null, timestamp=null)";
        }
    }

    public static abstract class g extends b0 {

        public static final class a extends g {

            /* renamed from: a, reason: collision with root package name */
            public final String f7424a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7425b;

            /* renamed from: c, reason: collision with root package name */
            public final String f7426c;

            /* renamed from: d, reason: collision with root package name */
            public final Instant f7427d;

            public a(String str, String str2, String str3, Instant instant) {
                k71.k.g(str, "id");
                this.f7424a = str;
                this.f7425b = str2;
                this.f7426c = str3;
                this.f7427d = instant;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7424a;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0.g
            public final String b() {
                return this.f7425b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return k71.k.b(this.f7424a, aVar.f7424a) && k71.k.b(this.f7425b, aVar.f7425b) && k71.k.b(this.f7426c, aVar.f7426c) && k71.k.b(this.f7427d, aVar.f7427d);
            }

            public final int hashCode() {
                int hashCode = this.f7424a.hashCode() * 31;
                String str = this.f7425b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f7426c;
                return this.f7427d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("FromAlert(id=", this.f7424a, ", userContent=", this.f7425b, ", alertUrl=");
                o5.append(this.f7426c);
                o5.append(", timestamp=");
                o5.append(this.f7427d);
                o5.append(")");
                return o5.toString();
            }
        }

        public static final class b extends g {

            /* renamed from: a, reason: collision with root package name */
            public final String f7428a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7429b;

            /* renamed from: c, reason: collision with root package name */
            public final Instant f7430c;

            public b(String str, String str2, Instant instant) {
                k71.k.g(str, "id");
                this.f7428a = str;
                this.f7429b = str2;
                this.f7430c = instant;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7428a;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0.g
            public final String b() {
                return this.f7429b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return k71.k.b(this.f7428a, bVar.f7428a) && k71.k.b(this.f7429b, bVar.f7429b) && k71.k.b(this.f7430c, bVar.f7430c);
            }

            public final int hashCode() {
                int hashCode = this.f7428a.hashCode() * 31;
                String str = this.f7429b;
                return this.f7430c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("FromCodeScanningAlert(id=", this.f7428a, ", userContent=", this.f7429b, ", timestamp=");
                o5.append(this.f7430c);
                o5.append(")");
                return o5.toString();
            }
        }

        public static final class c extends g {

            /* renamed from: a, reason: collision with root package name */
            public final String f7431a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7432b;

            /* renamed from: c, reason: collision with root package name */
            public final Long f7433c;

            /* renamed from: d, reason: collision with root package name */
            public final String f7434d;

            /* renamed from: e, reason: collision with root package name */
            public final Instant f7435e;

            public c(String str, String str2, Long l, String str3, Instant instant) {
                k71.k.g(str, "id");
                this.f7431a = str;
                this.f7432b = str2;
                this.f7433c = l;
                this.f7434d = str3;
                this.f7435e = instant;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7431a;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0.g
            public final String b() {
                return this.f7432b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return k71.k.b(this.f7431a, cVar.f7431a) && k71.k.b(this.f7432b, cVar.f7432b) && k71.k.b(this.f7433c, cVar.f7433c) && k71.k.b(this.f7434d, cVar.f7434d) && k71.k.b(this.f7435e, cVar.f7435e);
            }

            public final int hashCode() {
                int hashCode = this.f7431a.hashCode() * 31;
                String str = this.f7432b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Long l = this.f7433c;
                int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
                String str2 = this.f7434d;
                return this.f7435e.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("FromIssue(id=", this.f7431a, ", userContent=", this.f7432b, ", issueNumber=");
                o5.append(this.f7433c);
                o5.append(", issueUrl=");
                o5.append(this.f7434d);
                o5.append(", timestamp=");
                o5.append(this.f7435e);
                o5.append(")");
                return o5.toString();
            }
        }

        public static final class d extends g {

            /* renamed from: a, reason: collision with root package name */
            public final String f7436a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7437b;

            /* renamed from: c, reason: collision with root package name */
            public final String f7438c;

            /* renamed from: d, reason: collision with root package name */
            public final Instant f7439d;

            public d(String str, String str2, String str3, Instant instant) {
                k71.k.g(str, "id");
                this.f7436a = str;
                this.f7437b = str2;
                this.f7438c = str3;
                this.f7439d = instant;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7436a;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0.g
            public final String b() {
                return this.f7437b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return k71.k.b(this.f7436a, dVar.f7436a) && k71.k.b(this.f7437b, dVar.f7437b) && k71.k.b(this.f7438c, dVar.f7438c) && k71.k.b(this.f7439d, dVar.f7439d);
            }

            public final int hashCode() {
                int hashCode = this.f7436a.hashCode() * 31;
                String str = this.f7437b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f7438c;
                return this.f7439d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("FromJira(id=", this.f7436a, ", userContent=", this.f7437b, ", jiraUrl=");
                o5.append(this.f7438c);
                o5.append(", timestamp=");
                o5.append(this.f7439d);
                o5.append(")");
                return o5.toString();
            }
        }

        public static final class e extends g {

            /* renamed from: a, reason: collision with root package name */
            public final String f7440a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7441b;

            /* renamed from: c, reason: collision with root package name */
            public final String f7442c;

            /* renamed from: d, reason: collision with root package name */
            public final Instant f7443d;

            public e(String str, String str2, String str3, Instant instant) {
                k71.k.g(str, "id");
                this.f7440a = str;
                this.f7441b = str2;
                this.f7442c = str3;
                this.f7443d = instant;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7440a;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0.g
            public final String b() {
                return this.f7441b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return k71.k.b(this.f7440a, eVar.f7440a) && k71.k.b(this.f7441b, eVar.f7441b) && k71.k.b(this.f7442c, eVar.f7442c) && k71.k.b(this.f7443d, eVar.f7443d);
            }

            public final int hashCode() {
                int hashCode = this.f7440a.hashCode() * 31;
                String str = this.f7441b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f7442c;
                return this.f7443d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("FromLinear(id=", this.f7440a, ", userContent=", this.f7441b, ", linearUrl=");
                o5.append(this.f7442c);
                o5.append(", timestamp=");
                o5.append(this.f7443d);
                o5.append(")");
                return o5.toString();
            }
        }

        public static final class f extends g {

            /* renamed from: a, reason: collision with root package name */
            public final String f7444a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7445b;

            /* renamed from: c, reason: collision with root package name */
            public final Instant f7446c;

            public f(String str, String str2, Instant instant) {
                k71.k.g(str, "id");
                this.f7444a = str;
                this.f7445b = str2;
                this.f7446c = instant;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7444a;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0.g
            public final String b() {
                return this.f7445b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return k71.k.b(this.f7444a, fVar.f7444a) && k71.k.b(this.f7445b, fVar.f7445b) && k71.k.b(this.f7446c, fVar.f7446c);
            }

            public final int hashCode() {
                int hashCode = this.f7444a.hashCode() * 31;
                String str = this.f7445b;
                return this.f7446c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("FromMergeConflict(id=", this.f7444a, ", userContent=", this.f7445b, ", timestamp=");
                o5.append(this.f7446c);
                o5.append(")");
                return o5.toString();
            }
        }

        /* renamed from: com.github.rudroid.agents.sessionevents.b0$g$g, reason: collision with other inner class name */
        public static final class C0011g extends g {

            /* renamed from: a, reason: collision with root package name */
            public final String f7447a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7448b;

            /* renamed from: c, reason: collision with root package name */
            public final Instant f7449c;

            public C0011g(String str, String str2, Instant instant) {
                k71.k.g(str, "id");
                this.f7447a = str;
                this.f7448b = str2;
                this.f7449c = instant;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7447a;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0.g
            public final String b() {
                return this.f7448b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0011g)) {
                    return false;
                }
                C0011g c0011g = (C0011g) obj;
                return k71.k.b(this.f7447a, c0011g.f7447a) && k71.k.b(this.f7448b, c0011g.f7448b) && k71.k.b(this.f7449c, c0011g.f7449c);
            }

            public final int hashCode() {
                int hashCode = this.f7447a.hashCode() * 31;
                String str = this.f7448b;
                return this.f7449c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("FromMobile(id=", this.f7447a, ", userContent=", this.f7448b, ", timestamp=");
                o5.append(this.f7449c);
                o5.append(")");
                return o5.toString();
            }
        }

        public static final class h extends g {

            /* renamed from: a, reason: collision with root package name */
            public final String f7450a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7451b;

            /* renamed from: c, reason: collision with root package name */
            public final Instant f7452c;

            public h(String str, String str2, Instant instant) {
                k71.k.g(str, "id");
                this.f7450a = str;
                this.f7451b = str2;
                this.f7452c = instant;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7450a;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0.g
            public final String b() {
                return this.f7451b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return k71.k.b(this.f7450a, hVar.f7450a) && k71.k.b(this.f7451b, hVar.f7451b) && k71.k.b(this.f7452c, hVar.f7452c);
            }

            public final int hashCode() {
                int hashCode = this.f7450a.hashCode() * 31;
                String str = this.f7451b;
                return this.f7452c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("FromPullRequestComment(id=", this.f7450a, ", userContent=", this.f7451b, ", timestamp=");
                o5.append(this.f7452c);
                o5.append(")");
                return o5.toString();
            }
        }

        public static final class i extends g {

            /* renamed from: a, reason: collision with root package name */
            public final String f7453a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7454b;

            /* renamed from: c, reason: collision with root package name */
            public final Instant f7455c;

            public i(String str, String str2, Instant instant) {
                k71.k.g(str, "id");
                this.f7453a = str;
                this.f7454b = str2;
                this.f7455c = instant;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7453a;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0.g
            public final String b() {
                return this.f7454b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return k71.k.b(this.f7453a, iVar.f7453a) && k71.k.b(this.f7454b, iVar.f7454b) && k71.k.b(this.f7455c, iVar.f7455c);
            }

            public final int hashCode() {
                int hashCode = this.f7453a.hashCode() * 31;
                String str = this.f7454b;
                return this.f7455c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("FromPullRequestReview(id=", this.f7453a, ", userContent=", this.f7454b, ", timestamp=");
                o5.append(this.f7455c);
                o5.append(")");
                return o5.toString();
            }
        }

        public static final class j extends g {

            /* renamed from: a, reason: collision with root package name */
            public final String f7456a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7457b;

            /* renamed from: c, reason: collision with root package name */
            public final Instant f7458c;

            public j(String str, String str2, Instant instant) {
                k71.k.g(str, "id");
                this.f7456a = str;
                this.f7457b = str2;
                this.f7458c = instant;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7456a;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0.g
            public final String b() {
                return this.f7457b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return k71.k.b(this.f7456a, jVar.f7456a) && k71.k.b(this.f7457b, jVar.f7457b) && k71.k.b(this.f7458c, jVar.f7458c);
            }

            public final int hashCode() {
                int hashCode = this.f7456a.hashCode() * 31;
                String str = this.f7457b;
                return this.f7458c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("FromUnknown(id=", this.f7456a, ", userContent=", this.f7457b, ", timestamp=");
                o5.append(this.f7458c);
                o5.append(")");
                return o5.toString();
            }
        }

        public static final class k extends g {

            /* renamed from: a, reason: collision with root package name */
            public final String f7459a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7460b;

            /* renamed from: c, reason: collision with root package name */
            public final String f7461c;

            /* renamed from: d, reason: collision with root package name */
            public final Instant f7462d;

            public k(String str, String str2, String str3, Instant instant) {
                k71.k.g(str, "id");
                this.f7459a = str;
                this.f7460b = str2;
                this.f7461c = str3;
                this.f7462d = instant;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7459a;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0.g
            public final String b() {
                return this.f7460b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return k71.k.b(this.f7459a, kVar.f7459a) && k71.k.b(this.f7460b, kVar.f7460b) && k71.k.b(this.f7461c, kVar.f7461c) && k71.k.b(this.f7462d, kVar.f7462d);
            }

            public final int hashCode() {
                int hashCode = this.f7459a.hashCode() * 31;
                String str = this.f7460b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f7461c;
                return this.f7462d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("FromWorkflowRunFailed(id=", this.f7459a, ", userContent=", this.f7460b, ", workflowUrl=");
                o5.append(this.f7461c);
                o5.append(", timestamp=");
                o5.append(this.f7462d);
                o5.append(")");
                return o5.toString();
            }
        }

        public static final class l extends g {

            /* renamed from: a, reason: collision with root package name */
            public final String f7463a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7464b;

            /* renamed from: c, reason: collision with root package name */
            public final k91.a f7465c;

            /* renamed from: d, reason: collision with root package name */
            public final Instant f7466d;

            public l(String str, String str2, k91.a aVar, Instant instant) {
                k71.k.g(str, "id");
                k71.k.g(aVar, "rootNode");
                this.f7463a = str;
                this.f7464b = str2;
                this.f7465c = aVar;
                this.f7466d = instant;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7463a;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0.g
            public final String b() {
                return this.f7464b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return k71.k.b(this.f7463a, lVar.f7463a) && k71.k.b(this.f7464b, lVar.f7464b) && k71.k.b(this.f7465c, lVar.f7465c) && k71.k.b(this.f7466d, lVar.f7466d);
            }

            public final int hashCode() {
                return this.f7466d.hashCode() + ((this.f7465c.hashCode() + com.github.rudroid.copilot.h1.i(this.f7463a.hashCode() * 31, this.f7464b, 31)) * 31);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("UserInitiated(id=", this.f7463a, ", userContent=", this.f7464b, ", rootNode=");
                o5.append(this.f7465c);
                o5.append(", timestamp=");
                o5.append(this.f7466d);
                o5.append(")");
                return o5.toString();
            }
        }

        public abstract String b();
    }

    public static final class h extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f7467a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7468b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7469c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f7470d;

        /* renamed from: e, reason: collision with root package name */
        public final com.github.rudroid.agents.sessionevents.ui.t2 f7471e;

        /* renamed from: f, reason: collision with root package name */
        public final long f7472f;

        /* renamed from: g, reason: collision with root package name */
        public final Long f7473g;

        /* renamed from: h, reason: collision with root package name */
        public final Instant f7474h;

        public h(String str, String str2, int i, boolean z10, com.github.rudroid.agents.sessionevents.ui.t2 t2Var, long j10, Long l, Instant instant) {
            k71.k.g(str, "id");
            this.f7467a = str;
            this.f7468b = str2;
            this.f7469c = i;
            this.f7470d = z10;
            this.f7471e = t2Var;
            this.f7472f = j10;
            this.f7473g = l;
            this.f7474h = instant;
        }

        @Override // com.github.rudroid.agents.sessionevents.b0
        public final String a() {
            return this.f7467a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return k71.k.b(this.f7467a, hVar.f7467a) && k71.k.b(this.f7468b, hVar.f7468b) && this.f7469c == hVar.f7469c && this.f7470d == hVar.f7470d && this.f7471e == hVar.f7471e && this.f7472f == hVar.f7472f && k71.k.b(this.f7473g, hVar.f7473g) && k71.k.b(this.f7474h, hVar.f7474h);
        }

        public final int hashCode() {
            int c10 = x.i.c((this.f7471e.hashCode() + x.i.e(a0.s0.b(this.f7469c, com.github.rudroid.copilot.h1.i(this.f7467a.hashCode() * 31, this.f7468b, 31), 31), 31, this.f7470d)) * 31, 31, this.f7472f);
            Long l = this.f7473g;
            return this.f7474h.hashCode() + ((c10 + (l == null ? 0 : l.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder o5 = a0.s0.o("SessionHeaderInfo(id=", this.f7467a, ", title=", this.f7468b, ", toolCallCount=");
            com.github.rudroid.m0.w(o5, this.f7469c, ", canExpand=", this.f7470d, ", state=");
            o5.append(this.f7471e);
            o5.append(", startTimeMillis=");
            o5.append(this.f7472f);
            o5.append(", endTimeMillis=");
            o5.append(this.f7473g);
            o5.append(", timestamp=");
            o5.append(this.f7474h);
            o5.append(")");
            return o5.toString();
        }
    }

    public static final class i extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f7475a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7476b;

        /* renamed from: c, reason: collision with root package name */
        public final String f7477c;

        /* renamed from: d, reason: collision with root package name */
        public final Instant f7478d;

        public i(String str, int i, String str2, Instant instant) {
            k71.k.g(str, "id");
            this.f7475a = str;
            this.f7476b = i;
            this.f7477c = str2;
            this.f7478d = instant;
        }

        @Override // com.github.rudroid.agents.sessionevents.b0
        public final String a() {
            return this.f7475a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return k71.k.b(this.f7475a, iVar.f7475a) && this.f7476b == iVar.f7476b && k71.k.b(this.f7477c, iVar.f7477c) && k71.k.b(this.f7478d, iVar.f7478d);
        }

        public final int hashCode() {
            int b10 = a0.s0.b(this.f7476b, this.f7475a.hashCode() * 31, 31);
            String str = this.f7477c;
            return this.f7478d.hashCode() + ((b10 + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder n10 = a0.s0.n(this.f7476b, "SessionLifecycle(id=", this.f7475a, ", labelResId=", ", labelArg=");
            n10.append(this.f7477c);
            n10.append(", timestamp=");
            n10.append(this.f7478d);
            n10.append(")");
            return n10.toString();
        }
    }

    public static final class j extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f7479a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7480b;

        /* renamed from: c, reason: collision with root package name */
        public final k91.a f7481c;

        /* renamed from: d, reason: collision with root package name */
        public final Instant f7482d;

        public j(String str, String str2, k91.a aVar, Instant instant) {
            k71.k.g(str, "id");
            k71.k.g(str2, "content");
            k71.k.g(aVar, "rootNode");
            this.f7479a = str;
            this.f7480b = str2;
            this.f7481c = aVar;
            this.f7482d = instant;
        }

        @Override // com.github.rudroid.agents.sessionevents.b0
        public final String a() {
            return this.f7479a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return k71.k.b(this.f7479a, jVar.f7479a) && k71.k.b(this.f7480b, jVar.f7480b) && k71.k.b(this.f7481c, jVar.f7481c) && k71.k.b(this.f7482d, jVar.f7482d);
        }

        public final int hashCode() {
            return this.f7482d.hashCode() + ((this.f7481c.hashCode() + com.github.rudroid.copilot.h1.i(this.f7479a.hashCode() * 31, this.f7480b, 31)) * 31);
        }

        public final String toString() {
            StringBuilder o5 = a0.s0.o("SystemInfo(id=", this.f7479a, ", content=", this.f7480b, ", rootNode=");
            o5.append(this.f7481c);
            o5.append(", timestamp=");
            o5.append(this.f7482d);
            o5.append(")");
            return o5.toString();
        }
    }

    public static final class k extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f7483a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7484b;

        /* renamed from: c, reason: collision with root package name */
        public final String f7485c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7486d;

        /* renamed from: e, reason: collision with root package name */
        public final w4 f7487e;

        /* renamed from: f, reason: collision with root package name */
        public final t4 f7488f;

        /* renamed from: g, reason: collision with root package name */
        public final String f7489g;

        /* renamed from: h, reason: collision with root package name */
        public final Instant f7490h;
        public final String i;

        /* renamed from: j, reason: collision with root package name */
        public final String f7491j;

        public k(String str, String str2, String str3, int i, w4 w4Var, t4 t4Var, String str4, Instant instant, String str5, String str6) {
            k71.k.g(str, "id");
            k71.k.g(str2, "toolName");
            this.f7483a = str;
            this.f7484b = str2;
            this.f7485c = str3;
            this.f7486d = i;
            this.f7487e = w4Var;
            this.f7488f = t4Var;
            this.f7489g = str4;
            this.f7490h = instant;
            this.i = str5;
            this.f7491j = str6;
        }

        @Override // com.github.rudroid.agents.sessionevents.b0
        public final String a() {
            return this.f7483a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return k71.k.b(this.f7483a, kVar.f7483a) && k71.k.b(this.f7484b, kVar.f7484b) && k71.k.b(this.f7485c, kVar.f7485c) && this.f7486d == kVar.f7486d && this.f7487e == kVar.f7487e && this.f7488f == kVar.f7488f && k71.k.b(this.f7489g, kVar.f7489g) && k71.k.b(this.f7490h, kVar.f7490h) && k71.k.b(this.i, kVar.i) && k71.k.b(this.f7491j, kVar.f7491j);
        }

        public final int hashCode() {
            int hashCode = (this.f7488f.hashCode() + ((this.f7487e.hashCode() + a0.s0.b(this.f7486d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.f7483a.hashCode() * 31, this.f7484b, 31), this.f7485c, 31), 31)) * 31)) * 31;
            String str = this.f7489g;
            int hashCode2 = (this.f7490h.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            String str2 = this.i;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f7491j;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder o5 = a0.s0.o("ToolExecution(id=", this.f7483a, ", toolName=", this.f7484b, ", title=");
            a0.s0.w(this.f7486d, this.f7485c, ", iconRes=", ", iconTint=", o5);
            o5.append(this.f7487e);
            o5.append(", status=");
            o5.append(this.f7488f);
            o5.append(", outputContent=");
            o5.append(this.f7489g);
            o5.append(", timestamp=");
            o5.append(this.f7490h);
            o5.append(", command=");
            return x.i.k(o5, this.i, ", filePath=", this.f7491j, ")");
        }
    }

    public static final class l extends b0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f7492a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7493b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7494c;

        /* renamed from: d, reason: collision with root package name */
        public final String f7495d;

        /* renamed from: e, reason: collision with root package name */
        public final k91.a f7496e;

        /* renamed from: f, reason: collision with root package name */
        public final Instant f7497f;

        public l(String str, boolean z10, boolean z11, String str2, k91.a aVar, Instant instant) {
            k71.k.g(str, "id");
            k71.k.g(str2, "content");
            k71.k.g(aVar, "rootNode");
            this.f7492a = str;
            this.f7493b = z10;
            this.f7494c = z11;
            this.f7495d = str2;
            this.f7496e = aVar;
            this.f7497f = instant;
        }

        @Override // com.github.rudroid.agents.sessionevents.b0
        public final String a() {
            return this.f7492a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return k71.k.b(this.f7492a, lVar.f7492a) && this.f7493b == lVar.f7493b && this.f7494c == lVar.f7494c && k71.k.b(this.f7495d, lVar.f7495d) && k71.k.b(this.f7496e, lVar.f7496e) && k71.k.b(this.f7497f, lVar.f7497f);
        }

        public final int hashCode() {
            return this.f7497f.hashCode() + ((this.f7496e.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(x.i.e(this.f7492a.hashCode() * 31, 31, this.f7493b), 31, this.f7494c), this.f7495d, 31)) * 31);
        }

        public final String toString() {
            StringBuilder o5 = com.github.rudroid.m0.o("UserPrompt(id=", this.f7492a, ", isPending=", ", isDismissed=", this.f7493b);
            com.github.rudroid.m0.z(o5, this.f7494c, ", content=", this.f7495d, ", rootNode=");
            o5.append(this.f7496e);
            o5.append(", timestamp=");
            o5.append(this.f7497f);
            o5.append(")");
            return o5.toString();
        }
    }

    public abstract String a();

    public static abstract class e extends b0 {

        public static final class b extends e {

            /* renamed from: a, reason: collision with root package name */
            public final String f7387a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7388b;

            /* renamed from: c, reason: collision with root package name */
            public final String f7389c;

            /* renamed from: d, reason: collision with root package name */
            public final List f7390d;

            /* renamed from: e, reason: collision with root package name */
            public final Set f7391e;

            /* renamed from: f, reason: collision with root package name */
            public final k91.a f7392f;

            /* renamed from: g, reason: collision with root package name */
            public final Instant f7393g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f7394h;
            public final String i;

            public b(String str, String str2, String str3, List list, Set set, k91.a aVar, Instant instant, boolean z10, String str4) {
                k71.k.g(str, "id");
                k71.k.g(aVar, "rootNode");
                this.f7387a = str;
                this.f7388b = str2;
                this.f7389c = str3;
                this.f7390d = list;
                this.f7391e = set;
                this.f7392f = aVar;
                this.f7393g = instant;
                this.f7394h = z10;
                this.i = str4;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7387a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return k71.k.b(this.f7387a, bVar.f7387a) && k71.k.b(this.f7388b, bVar.f7388b) && k71.k.b(this.f7389c, bVar.f7389c) && k71.k.b(this.f7390d, bVar.f7390d) && k71.k.b(this.f7391e, bVar.f7391e) && k71.k.b(this.f7392f, bVar.f7392f) && k71.k.b(this.f7393g, bVar.f7393g) && this.f7394h == bVar.f7394h && k71.k.b(this.i, bVar.i);
            }

            public final int hashCode() {
                int e5 = x.i.e((this.f7393g.hashCode() + ((this.f7392f.hashCode() + ((this.f7391e.hashCode() + f1.e.c(this.f7390d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.f7387a.hashCode() * 31, this.f7388b, 31), this.f7389c, 31), 31)) * 31)) * 31)) * 31, 31, this.f7394h);
                String str = this.i;
                return e5 + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("Elicitation(id=", this.f7387a, ", toolCallId=", this.f7388b, ", message=");
                o5.append(this.f7389c);
                o5.append(", fields=");
                o5.append(this.f7390d);
                o5.append(", requiredFields=");
                o5.append(this.f7391e);
                o5.append(", rootNode=");
                o5.append(this.f7392f);
                o5.append(", timestamp=");
                o5.append(this.f7393g);
                o5.append(", isResolved=");
                o5.append(this.f7394h);
                o5.append(", responseLabel=");
                return com.github.rudroid.copilot.h1.p(o5, this.i, ")");
            }
        }

        /* renamed from: com.github.rudroid.agents.sessionevents.b0$e$e, reason: collision with other inner class name */
        public static final class C0010e extends e {

            /* renamed from: a, reason: collision with root package name */
            public final String f7416a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7417b;

            /* renamed from: c, reason: collision with root package name */
            public final String f7418c;

            /* renamed from: d, reason: collision with root package name */
            public final List f7419d;

            /* renamed from: e, reason: collision with root package name */
            public final k91.a f7420e;

            /* renamed from: f, reason: collision with root package name */
            public final Instant f7421f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f7422g;

            /* renamed from: h, reason: collision with root package name */
            public final int f7423h;
            public final String i;

            public C0010e(String str, String str2, String str3, List list, k91.a aVar, Instant instant, boolean z10, int i, String str4) {
                k71.k.g(str, "id");
                k71.k.g(str2, "messageId");
                k71.k.g(aVar, "rootNode");
                this.f7416a = str;
                this.f7417b = str2;
                this.f7418c = str3;
                this.f7419d = list;
                this.f7420e = aVar;
                this.f7421f = instant;
                this.f7422g = z10;
                this.f7423h = i;
                this.i = str4;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7416a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0010e)) {
                    return false;
                }
                C0010e c0010e = (C0010e) obj;
                return k71.k.b(this.f7416a, c0010e.f7416a) && k71.k.b(this.f7417b, c0010e.f7417b) && k71.k.b(this.f7418c, c0010e.f7418c) && k71.k.b(this.f7419d, c0010e.f7419d) && k71.k.b(this.f7420e, c0010e.f7420e) && k71.k.b(this.f7421f, c0010e.f7421f) && this.f7422g == c0010e.f7422g && this.f7423h == c0010e.f7423h && k71.k.b(this.i, c0010e.i);
            }

            public final int hashCode() {
                int b10 = a0.s0.b(this.f7423h, x.i.e((this.f7421f.hashCode() + ((this.f7420e.hashCode() + f1.e.c(this.f7419d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.f7416a.hashCode() * 31, this.f7417b, 31), this.f7418c, 31), 31)) * 31)) * 31, 31, this.f7422g), 31);
                String str = this.i;
                return b10 + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("PlanApprovalTag(id=", this.f7416a, ", messageId=", this.f7417b, ", planBody=");
                o5.append(this.f7418c);
                o5.append(", options=");
                o5.append(this.f7419d);
                o5.append(", rootNode=");
                o5.append(this.f7420e);
                o5.append(", timestamp=");
                o5.append(this.f7421f);
                o5.append(", isResolved=");
                com.github.rudroid.m0.y(o5, this.f7422g, ", selectedOptionIndex=", this.f7423h, ", responseLabel=");
                return com.github.rudroid.copilot.h1.p(o5, this.i, ")");
            }
        }

        public static final class a extends e {

            /* renamed from: a, reason: collision with root package name */
            public final String f7378a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7379b;

            /* renamed from: c, reason: collision with root package name */
            public final String f7380c;

            /* renamed from: d, reason: collision with root package name */
            public final String f7381d;

            /* renamed from: e, reason: collision with root package name */
            public final List f7382e;

            /* renamed from: f, reason: collision with root package name */
            public final k91.a f7383f;

            /* renamed from: g, reason: collision with root package name */
            public final Instant f7384g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f7385h;
            public final int i;

            /* renamed from: j, reason: collision with root package name */
            public final String f7386j;

            public a(String str, String str2, String str3, String str4, List list, k91.a aVar, Instant instant, boolean z10, int i, String str5) {
                k71.k.g(str, "id");
                k71.k.g(str4, "question");
                k71.k.g(list, "choices");
                k71.k.g(aVar, "rootNode");
                k71.k.g(instant, "timestamp");
                this.f7378a = str;
                this.f7379b = str2;
                this.f7380c = str3;
                this.f7381d = str4;
                this.f7382e = list;
                this.f7383f = aVar;
                this.f7384g = instant;
                this.f7385h = z10;
                this.i = i;
                this.f7386j = str5;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7378a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return k71.k.b(this.f7378a, aVar.f7378a) && k71.k.b(this.f7379b, aVar.f7379b) && k71.k.b(this.f7380c, aVar.f7380c) && k71.k.b(this.f7381d, aVar.f7381d) && k71.k.b(this.f7382e, aVar.f7382e) && k71.k.b(this.f7383f, aVar.f7383f) && k71.k.b(this.f7384g, aVar.f7384g) && this.f7385h == aVar.f7385h && this.i == aVar.i && k71.k.b(this.f7386j, aVar.f7386j);
            }

            public final int hashCode() {
                int hashCode = this.f7378a.hashCode() * 31;
                String str = this.f7379b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f7380c;
                int b10 = a0.s0.b(this.i, x.i.e((this.f7384g.hashCode() + ((this.f7383f.hashCode() + f1.e.c(this.f7382e, com.github.rudroid.copilot.h1.i((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, this.f7381d, 31), 31)) * 31)) * 31, 31, this.f7385h), 31);
                String str3 = this.f7386j;
                return b10 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("AskUser(id=", this.f7378a, ", toolCallId=", this.f7379b, ", toolName=");
                f1.e.x(o5, this.f7380c, ", question=", this.f7381d, ", choices=");
                o5.append(this.f7382e);
                o5.append(", rootNode=");
                o5.append(this.f7383f);
                o5.append(", timestamp=");
                o5.append(this.f7384g);
                o5.append(", isResolved=");
                o5.append(this.f7385h);
                o5.append(", selectedOptionIndex=");
                return com.github.rudroid.m0.c(this.i, ", responseLabel=", this.f7386j, ")", o5);
            }

            public /* synthetic */ a(String str, String str2, String str3, String str4, ArrayList arrayList, k91.a aVar, Instant instant, boolean z10, String str5, int i) {
                this(str, str2, str3, str4, arrayList, aVar, instant, (i & 128) != 0 ? false : z10, -1, (i & 512) != 0 ? null : str5);
            }
        }

        public static final class c extends e {

            /* renamed from: a, reason: collision with root package name */
            public final String f7395a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7396b;

            /* renamed from: c, reason: collision with root package name */
            public final String f7397c;

            /* renamed from: d, reason: collision with root package name */
            public final String f7398d;

            /* renamed from: e, reason: collision with root package name */
            public final List f7399e;

            /* renamed from: f, reason: collision with root package name */
            public final k91.a f7400f;

            /* renamed from: g, reason: collision with root package name */
            public final Instant f7401g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f7402h;
            public final int i;

            /* renamed from: j, reason: collision with root package name */
            public final String f7403j;

            public c(String str, String str2, String str3, String str4, List list, k91.a aVar, Instant instant, boolean z10, int i, String str5) {
                k71.k.g(str, "id");
                k71.k.g(str4, "summary");
                k71.k.g(list, "actions");
                k71.k.g(aVar, "rootNode");
                k71.k.g(instant, "timestamp");
                this.f7395a = str;
                this.f7396b = str2;
                this.f7397c = str3;
                this.f7398d = str4;
                this.f7399e = list;
                this.f7400f = aVar;
                this.f7401g = instant;
                this.f7402h = z10;
                this.i = i;
                this.f7403j = str5;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7395a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return k71.k.b(this.f7395a, cVar.f7395a) && k71.k.b(this.f7396b, cVar.f7396b) && k71.k.b(this.f7397c, cVar.f7397c) && k71.k.b(this.f7398d, cVar.f7398d) && k71.k.b(this.f7399e, cVar.f7399e) && k71.k.b(this.f7400f, cVar.f7400f) && k71.k.b(this.f7401g, cVar.f7401g) && this.f7402h == cVar.f7402h && this.i == cVar.i && k71.k.b(this.f7403j, cVar.f7403j);
            }

            public final int hashCode() {
                int hashCode = this.f7395a.hashCode() * 31;
                String str = this.f7396b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f7397c;
                int b10 = a0.s0.b(this.i, x.i.e((this.f7401g.hashCode() + ((this.f7400f.hashCode() + f1.e.c(this.f7399e, com.github.rudroid.copilot.h1.i((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, this.f7398d, 31), 31)) * 31)) * 31, 31, this.f7402h), 31);
                String str3 = this.f7403j;
                return b10 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("ExitPlanMode(id=", this.f7395a, ", toolCallId=", this.f7396b, ", toolName=");
                f1.e.x(o5, this.f7397c, ", summary=", this.f7398d, ", actions=");
                o5.append(this.f7399e);
                o5.append(", rootNode=");
                o5.append(this.f7400f);
                o5.append(", timestamp=");
                o5.append(this.f7401g);
                o5.append(", isResolved=");
                o5.append(this.f7402h);
                o5.append(", selectedOptionIndex=");
                return com.github.rudroid.m0.c(this.i, ", responseLabel=", this.f7403j, ")", o5);
            }

            public /* synthetic */ c(String str, String str2, String str3, String str4, ArrayList arrayList, k91.a aVar, Instant instant, boolean z10, String str5, int i) {
                this(str, str2, str3, str4, arrayList, aVar, instant, (i & 128) != 0 ? false : z10, -1, (i & 512) != 0 ? null : str5);
            }
        }

        public static final class d extends e {

            /* renamed from: a, reason: collision with root package name */
            public final String f7404a;

            /* renamed from: b, reason: collision with root package name */
            public final String f7405b;

            /* renamed from: c, reason: collision with root package name */
            public final String f7406c;

            /* renamed from: d, reason: collision with root package name */
            public final String f7407d;

            /* renamed from: e, reason: collision with root package name */
            public final String f7408e;

            /* renamed from: f, reason: collision with root package name */
            public final String f7409f;

            /* renamed from: g, reason: collision with root package name */
            public final String f7410g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f7411h;
            public final List i;

            /* renamed from: j, reason: collision with root package name */
            public final k91.a f7412j;

            /* renamed from: k, reason: collision with root package name */
            public final Instant f7413k;
            public final boolean l;
            public final com.github.rudroid.fileschanged.ui.a0 m;

            /* renamed from: n, reason: collision with root package name */
            public final int f7414n;

            /* renamed from: o, reason: collision with root package name */
            public final String f7415o;

            public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, List list, k91.a aVar, Instant instant, boolean z11, com.github.rudroid.fileschanged.ui.a0 a0Var, int i, String str8) {
                k71.k.g(str, "id");
                k71.k.g(str2, "promptId");
                k71.k.g(str3, "kind");
                k71.k.g(list, "answers");
                k71.k.g(aVar, "rootNode");
                k71.k.g(instant, "timestamp");
                this.f7404a = str;
                this.f7405b = str2;
                this.f7406c = str3;
                this.f7407d = str4;
                this.f7408e = str5;
                this.f7409f = str6;
                this.f7410g = str7;
                this.f7411h = z10;
                this.i = list;
                this.f7412j = aVar;
                this.f7413k = instant;
                this.l = z11;
                this.m = a0Var;
                this.f7414n = i;
                this.f7415o = str8;
            }

            @Override // com.github.rudroid.agents.sessionevents.b0
            public final String a() {
                return this.f7404a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return k71.k.b(this.f7404a, dVar.f7404a) && k71.k.b(this.f7405b, dVar.f7405b) && k71.k.b(this.f7406c, dVar.f7406c) && k71.k.b(this.f7407d, dVar.f7407d) && k71.k.b(this.f7408e, dVar.f7408e) && k71.k.b(this.f7409f, dVar.f7409f) && k71.k.b(this.f7410g, dVar.f7410g) && this.f7411h == dVar.f7411h && k71.k.b(this.i, dVar.i) && k71.k.b(this.f7412j, dVar.f7412j) && k71.k.b(this.f7413k, dVar.f7413k) && this.l == dVar.l && k71.k.b(this.m, dVar.m) && this.f7414n == dVar.f7414n && k71.k.b(this.f7415o, dVar.f7415o);
            }

            public final int hashCode() {
                int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.f7404a.hashCode() * 31, this.f7405b, 31), this.f7406c, 31);
                String str = this.f7407d;
                int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f7408e;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f7409f;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f7410g;
                int e5 = x.i.e((this.f7413k.hashCode() + ((this.f7412j.hashCode() + f1.e.c(this.i, x.i.e((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f7411h), 31)) * 31)) * 31, 31, this.l);
                com.github.rudroid.fileschanged.ui.a0 a0Var = this.m;
                int b10 = a0.s0.b(this.f7414n, (e5 + (a0Var == null ? 0 : a0Var.hashCode())) * 31, 31);
                String str5 = this.f7415o;
                return b10 + (str5 != null ? str5.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder o5 = a0.s0.o("PermissionRequest(id=", this.f7404a, ", promptId=", this.f7405b, ", kind=");
                f1.e.x(o5, this.f7406c, ", intention=", this.f7407d, ", command=");
                f1.e.x(o5, this.f7408e, ", fileName=", this.f7409f, ", filePath=");
                com.github.rudroid.m0.x(o5, this.f7410g, ", canOfferSessionApproval=", this.f7411h, ", answers=");
                o5.append(this.i);
                o5.append(", rootNode=");
                o5.append(this.f7412j);
                o5.append(", timestamp=");
                o5.append(this.f7413k);
                o5.append(", isResolved=");
                o5.append(this.l);
                o5.append(", diffData=");
                o5.append(this.m);
                o5.append(", selectedOptionIndex=");
                o5.append(this.f7414n);
                o5.append(", responseLabel=");
                return com.github.rudroid.copilot.h1.p(o5, this.f7415o, ")");
            }

            public /* synthetic */ d(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, List list, k91.a aVar, Instant instant, boolean z11, com.github.rudroid.fileschanged.ui.a0 a0Var, String str8, int i) {
                this(str, str2, str3, str4, str5, str6, str7, z10, list, aVar, instant, (i & 2048) != 0 ? false : z11, (i & 4096) != 0 ? null : a0Var, -1, (i & 16384) != 0 ? null : str8);
            }
        }
    }
}
