package com.github.rudroid.agents.copilothome.navigation;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.discussions.type.DiscussionStateReason;

/* loaded from: /home/user/work/p/classes.dex */
public interface e extends Parcelable {

    public static final class a implements e, k {
        public static final Parcelable.Creator<a> CREATOR = new C0008a();

        /* renamed from: r, reason: collision with root package name */
        public String f6787r;

        /* renamed from: s, reason: collision with root package name */
        public String f6788s;

        /* renamed from: t, reason: collision with root package name */
        public int f6789t;

        /* renamed from: u, reason: collision with root package name */
        public String f6790u;

        /* renamed from: v, reason: collision with root package name */
        public DiscussionStateReason f6791v;

        /* renamed from: w, reason: collision with root package name */
        public String f6792w;

        /* renamed from: com.github.rudroid.agents.copilothome.navigation.e$a$a, reason: collision with other inner class name */
        public static final class C0008a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), DiscussionStateReason.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(String str, String str2, int i, String str3, DiscussionStateReason discussionStateReason, String str4) {
            k71.k.g(str, "repoOwner");
            k71.k.g(str2, "repoName");
            k71.k.g(str3, "title");
            k71.k.g(discussionStateReason, "closedReason");
            this.f6787r = str;
            this.f6788s = str2;
            this.f6789t = i;
            this.f6790u = str3;
            this.f6791v = discussionStateReason;
            this.f6792w = str4;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e
        public final String B() {
            return this.f6792w;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k71.k.b(this.f6787r, aVar.f6787r) && k71.k.b(this.f6788s, aVar.f6788s) && this.f6789t == aVar.f6789t && k71.k.b(this.f6790u, aVar.f6790u) && this.f6791v == aVar.f6791v && k71.k.b(this.f6792w, aVar.f6792w);
        }

        public final int hashCode() {
            int hashCode = (this.f6791v.hashCode() + h1.i(s0.b(this.f6789t, h1.i(this.f6787r.hashCode() * 31, this.f6788s, 31), 31), this.f6790u, 31)) * 31;
            String str = this.f6792w;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String m() {
            return this.f6788s;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String o() {
            return this.f6787r;
        }

        public final String toString() {
            StringBuilder o5 = s0.o("DiscussionDetailContext(repoOwner=", this.f6787r, ", repoName=", this.f6788s, ", number=");
            x.i.r(this.f6789t, ", title=", this.f6790u, ", closedReason=", o5);
            o5.append(this.f6791v);
            o5.append(", currentUrl=");
            o5.append(this.f6792w);
            o5.append(")");
            return o5.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f6787r);
            parcel.writeString(this.f6788s);
            parcel.writeInt(this.f6789t);
            parcel.writeString(this.f6790u);
            parcel.writeString(this.f6791v.name());
            parcel.writeString(this.f6792w);
        }
    }

    public static final class b implements e, k {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: r, reason: collision with root package name */
        public String f6793r;

        /* renamed from: s, reason: collision with root package name */
        public String f6794s;

        /* renamed from: t, reason: collision with root package name */
        public String f6795t;

        /* renamed from: u, reason: collision with root package name */
        public String f6796u;

        /* renamed from: v, reason: collision with root package name */
        public String f6797v;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(String str, String str2, String str3, String str4, String str5) {
            k71.k.g(str, "repoOwner");
            k71.k.g(str2, "repoName");
            k71.k.g(str3, "ref");
            k71.k.g(str4, "path");
            this.f6793r = str;
            this.f6794s = str2;
            this.f6795t = str3;
            this.f6796u = str4;
            this.f6797v = str5;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e
        public final String B() {
            return this.f6797v;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k71.k.b(this.f6793r, bVar.f6793r) && k71.k.b(this.f6794s, bVar.f6794s) && k71.k.b(this.f6795t, bVar.f6795t) && k71.k.b(this.f6796u, bVar.f6796u) && k71.k.b(this.f6797v, bVar.f6797v);
        }

        public final int hashCode() {
            int i = h1.i(h1.i(h1.i(this.f6793r.hashCode() * 31, this.f6794s, 31), this.f6795t, 31), this.f6796u, 31);
            String str = this.f6797v;
            return i + (str == null ? 0 : str.hashCode());
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String m() {
            return this.f6794s;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String o() {
            return this.f6793r;
        }

        public final String toString() {
            StringBuilder o5 = s0.o("FileContext(repoOwner=", this.f6793r, ", repoName=", this.f6794s, ", ref=");
            f1.e.x(o5, this.f6795t, ", path=", this.f6796u, ", currentUrl=");
            return h1.p(o5, this.f6797v, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f6793r);
            parcel.writeString(this.f6794s);
            parcel.writeString(this.f6795t);
            parcel.writeString(this.f6796u);
            parcel.writeString(this.f6797v);
        }
    }

    public static final class c implements e, k {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: r, reason: collision with root package name */
        public String f6798r;

        /* renamed from: s, reason: collision with root package name */
        public String f6799s;

        /* renamed from: t, reason: collision with root package name */
        public int f6800t;

        /* renamed from: u, reason: collision with root package name */
        public String f6801u;

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new c(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(int i, String str, String str2, String str3) {
            k71.k.g(str, "repoOwner");
            k71.k.g(str2, "repoName");
            this.f6798r = str;
            this.f6799s = str2;
            this.f6800t = i;
            this.f6801u = str3;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e
        public final String B() {
            return this.f6801u;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k71.k.b(this.f6798r, cVar.f6798r) && k71.k.b(this.f6799s, cVar.f6799s) && this.f6800t == cVar.f6800t && k71.k.b(this.f6801u, cVar.f6801u);
        }

        public final int hashCode() {
            int b10 = s0.b(this.f6800t, h1.i(this.f6798r.hashCode() * 31, this.f6799s, 31), 31);
            String str = this.f6801u;
            return b10 + (str == null ? 0 : str.hashCode());
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String m() {
            return this.f6799s;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String o() {
            return this.f6798r;
        }

        public final String toString() {
            return m0.c(this.f6800t, ", currentUrl=", this.f6801u, ")", s0.o("FilesChangedContext(repoOwner=", this.f6798r, ", repoName=", this.f6799s, ", number="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f6798r);
            parcel.writeString(this.f6799s);
            parcel.writeInt(this.f6800t);
            parcel.writeString(this.f6801u);
        }
    }

    public static final class d implements e, k {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: r, reason: collision with root package name */
        public String f6802r;

        /* renamed from: s, reason: collision with root package name */
        public String f6803s;

        /* renamed from: t, reason: collision with root package name */
        public int f6804t;

        /* renamed from: u, reason: collision with root package name */
        public String f6805u;

        /* renamed from: v, reason: collision with root package name */
        public IssueOrPullRequestState f6806v;

        /* renamed from: w, reason: collision with root package name */
        public String f6807w;

        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), IssueOrPullRequestState.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        public d(String str, String str2, int i, String str3, IssueOrPullRequestState issueOrPullRequestState, String str4) {
            k71.k.g(str, "repoOwner");
            k71.k.g(str2, "repoName");
            k71.k.g(str3, "title");
            k71.k.g(issueOrPullRequestState, "state");
            this.f6802r = str;
            this.f6803s = str2;
            this.f6804t = i;
            this.f6805u = str3;
            this.f6806v = issueOrPullRequestState;
            this.f6807w = str4;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e
        public final String B() {
            return this.f6807w;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return k71.k.b(this.f6802r, dVar.f6802r) && k71.k.b(this.f6803s, dVar.f6803s) && this.f6804t == dVar.f6804t && k71.k.b(this.f6805u, dVar.f6805u) && this.f6806v == dVar.f6806v && k71.k.b(this.f6807w, dVar.f6807w);
        }

        public final int hashCode() {
            int hashCode = (this.f6806v.hashCode() + h1.i(s0.b(this.f6804t, h1.i(this.f6802r.hashCode() * 31, this.f6803s, 31), 31), this.f6805u, 31)) * 31;
            String str = this.f6807w;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String m() {
            return this.f6803s;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String o() {
            return this.f6802r;
        }

        public final String toString() {
            StringBuilder o5 = s0.o("IssueContext(repoOwner=", this.f6802r, ", repoName=", this.f6803s, ", number=");
            x.i.r(this.f6804t, ", title=", this.f6805u, ", state=", o5);
            o5.append(this.f6806v);
            o5.append(", currentUrl=");
            o5.append(this.f6807w);
            o5.append(")");
            return o5.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f6802r);
            parcel.writeString(this.f6803s);
            parcel.writeInt(this.f6804t);
            parcel.writeString(this.f6805u);
            parcel.writeString(this.f6806v.name());
            parcel.writeString(this.f6807w);
        }
    }

    /* renamed from: com.github.rudroid.agents.copilothome.navigation.e$e, reason: collision with other inner class name */
    public static final class C0009e implements e, k {
        public static final Parcelable.Creator<C0009e> CREATOR = new a();

        /* renamed from: r, reason: collision with root package name */
        public String f6808r;

        /* renamed from: s, reason: collision with root package name */
        public String f6809s;

        /* renamed from: t, reason: collision with root package name */
        public int f6810t;

        /* renamed from: u, reason: collision with root package name */
        public String f6811u;

        /* renamed from: v, reason: collision with root package name */
        public IssueOrPullRequestState f6812v;

        /* renamed from: w, reason: collision with root package name */
        public String f6813w;

        /* renamed from: com.github.rudroid.agents.copilothome.navigation.e$e$a */
        public static final class a implements Parcelable.Creator<C0009e> {
            @Override // android.os.Parcelable.Creator
            public final C0009e createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new C0009e(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), IssueOrPullRequestState.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final C0009e[] newArray(int i) {
                return new C0009e[i];
            }
        }

        public C0009e(String str, String str2, int i, String str3, IssueOrPullRequestState issueOrPullRequestState, String str4) {
            k71.k.g(str, "repoOwner");
            k71.k.g(str2, "repoName");
            k71.k.g(str3, "title");
            k71.k.g(issueOrPullRequestState, "state");
            this.f6808r = str;
            this.f6809s = str2;
            this.f6810t = i;
            this.f6811u = str3;
            this.f6812v = issueOrPullRequestState;
            this.f6813w = str4;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e
        public final String B() {
            return this.f6813w;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0009e)) {
                return false;
            }
            C0009e c0009e = (C0009e) obj;
            return k71.k.b(this.f6808r, c0009e.f6808r) && k71.k.b(this.f6809s, c0009e.f6809s) && this.f6810t == c0009e.f6810t && k71.k.b(this.f6811u, c0009e.f6811u) && this.f6812v == c0009e.f6812v && k71.k.b(this.f6813w, c0009e.f6813w);
        }

        public final int hashCode() {
            int hashCode = (this.f6812v.hashCode() + h1.i(s0.b(this.f6810t, h1.i(this.f6808r.hashCode() * 31, this.f6809s, 31), 31), this.f6811u, 31)) * 31;
            String str = this.f6813w;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String m() {
            return this.f6809s;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String o() {
            return this.f6808r;
        }

        public final String toString() {
            StringBuilder o5 = s0.o("PullRequestContext(repoOwner=", this.f6808r, ", repoName=", this.f6809s, ", number=");
            x.i.r(this.f6810t, ", title=", this.f6811u, ", state=", o5);
            o5.append(this.f6812v);
            o5.append(", currentUrl=");
            o5.append(this.f6813w);
            o5.append(")");
            return o5.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f6808r);
            parcel.writeString(this.f6809s);
            parcel.writeInt(this.f6810t);
            parcel.writeString(this.f6811u);
            parcel.writeString(this.f6812v.name());
            parcel.writeString(this.f6813w);
        }
    }

    public static final class f implements e {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: r, reason: collision with root package name */
        public String f6814r;

        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new f(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(String str) {
            this.f6814r = str;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e
        public final String B() {
            return this.f6814r;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && k71.k.b(this.f6814r, ((f) obj).f6814r);
        }

        public final int hashCode() {
            String str = this.f6814r;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return f1.e.z("RepositoriesListContext(currentUrl=", this.f6814r, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f6814r);
        }
    }

    public static final class g implements e, k {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: r, reason: collision with root package name */
        public String f6815r;

        /* renamed from: s, reason: collision with root package name */
        public String f6816s;

        /* renamed from: t, reason: collision with root package name */
        public String f6817t;

        /* renamed from: u, reason: collision with root package name */
        public String f6818u;

        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(String str, String str2, String str3, String str4) {
            k71.k.g(str, "repoOwner");
            k71.k.g(str2, "repoName");
            this.f6815r = str;
            this.f6816s = str2;
            this.f6817t = str3;
            this.f6818u = str4;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e
        public final String B() {
            return this.f6818u;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return k71.k.b(this.f6815r, gVar.f6815r) && k71.k.b(this.f6816s, gVar.f6816s) && k71.k.b(this.f6817t, gVar.f6817t) && k71.k.b(this.f6818u, gVar.f6818u);
        }

        public final int hashCode() {
            int i = h1.i(this.f6815r.hashCode() * 31, this.f6816s, 31);
            String str = this.f6817t;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f6818u;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String m() {
            return this.f6816s;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String o() {
            return this.f6815r;
        }

        public final String toString() {
            return x.i.k(s0.o("RepositoryContext(repoOwner=", this.f6815r, ", repoName=", this.f6816s, ", selectedBranch="), this.f6817t, ", currentUrl=", this.f6818u, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f6815r);
            parcel.writeString(this.f6816s);
            parcel.writeString(this.f6817t);
            parcel.writeString(this.f6818u);
        }
    }

    public static final class h implements e, k {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: r, reason: collision with root package name */
        public String f6819r;

        /* renamed from: s, reason: collision with root package name */
        public String f6820s;

        /* renamed from: t, reason: collision with root package name */
        public String f6821t;

        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new h(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i) {
                return new h[i];
            }
        }

        public h(String str, String str2, String str3) {
            k71.k.g(str, "repoOwner");
            k71.k.g(str2, "repoName");
            this.f6819r = str;
            this.f6820s = str2;
            this.f6821t = str3;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e
        public final String B() {
            return this.f6821t;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return k71.k.b(this.f6819r, hVar.f6819r) && k71.k.b(this.f6820s, hVar.f6820s) && k71.k.b(this.f6821t, hVar.f6821t);
        }

        public final int hashCode() {
            int i = h1.i(this.f6819r.hashCode() * 31, this.f6820s, 31);
            String str = this.f6821t;
            return i + (str == null ? 0 : str.hashCode());
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String m() {
            return this.f6820s;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String o() {
            return this.f6819r;
        }

        public final String toString() {
            return h1.p(s0.o("RepositoryDiscussionsContext(repoOwner=", this.f6819r, ", repoName=", this.f6820s, ", currentUrl="), this.f6821t, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f6819r);
            parcel.writeString(this.f6820s);
            parcel.writeString(this.f6821t);
        }
    }

    public static final class i implements e, k {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: r, reason: collision with root package name */
        public String f6822r;

        /* renamed from: s, reason: collision with root package name */
        public String f6823s;

        /* renamed from: t, reason: collision with root package name */
        public String f6824t;

        public static final class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            public final i createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new i(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final i[] newArray(int i) {
                return new i[i];
            }
        }

        public i(String str, String str2, String str3) {
            k71.k.g(str, "repoOwner");
            k71.k.g(str2, "repoName");
            this.f6822r = str;
            this.f6823s = str2;
            this.f6824t = str3;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e
        public final String B() {
            return this.f6824t;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return k71.k.b(this.f6822r, iVar.f6822r) && k71.k.b(this.f6823s, iVar.f6823s) && k71.k.b(this.f6824t, iVar.f6824t);
        }

        public final int hashCode() {
            int i = h1.i(this.f6822r.hashCode() * 31, this.f6823s, 31);
            String str = this.f6824t;
            return i + (str == null ? 0 : str.hashCode());
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String m() {
            return this.f6823s;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String o() {
            return this.f6822r;
        }

        public final String toString() {
            return h1.p(s0.o("RepositoryIssuesContext(repoOwner=", this.f6822r, ", repoName=", this.f6823s, ", currentUrl="), this.f6824t, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f6822r);
            parcel.writeString(this.f6823s);
            parcel.writeString(this.f6824t);
        }
    }

    public static final class j implements e, k {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: r, reason: collision with root package name */
        public String f6825r;

        /* renamed from: s, reason: collision with root package name */
        public String f6826s;

        /* renamed from: t, reason: collision with root package name */
        public String f6827t;

        public static final class a implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            public final j createFromParcel(Parcel parcel) {
                k71.k.g(parcel, "parcel");
                return new j(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final j[] newArray(int i) {
                return new j[i];
            }
        }

        public j(String str, String str2, String str3) {
            k71.k.g(str, "repoOwner");
            k71.k.g(str2, "repoName");
            this.f6825r = str;
            this.f6826s = str2;
            this.f6827t = str3;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e
        public final String B() {
            return this.f6827t;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return k71.k.b(this.f6825r, jVar.f6825r) && k71.k.b(this.f6826s, jVar.f6826s) && k71.k.b(this.f6827t, jVar.f6827t);
        }

        public final int hashCode() {
            int i = h1.i(this.f6825r.hashCode() * 31, this.f6826s, 31);
            String str = this.f6827t;
            return i + (str == null ? 0 : str.hashCode());
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String m() {
            return this.f6826s;
        }

        @Override // com.github.rudroid.agents.copilothome.navigation.e.k
        public final String o() {
            return this.f6825r;
        }

        public final String toString() {
            return h1.p(s0.o("RepositoryPullRequestsContext(repoOwner=", this.f6825r, ", repoName=", this.f6826s, ", currentUrl="), this.f6827t, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k71.k.g(parcel, "dest");
            parcel.writeString(this.f6825r);
            parcel.writeString(this.f6826s);
            parcel.writeString(this.f6827t);
        }
    }

    public interface k {
        String m();

        String o();
    }

    String B();
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
