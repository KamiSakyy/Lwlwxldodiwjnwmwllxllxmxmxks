package xn;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 extends b1 implements Parcelable {
    public static final Parcelable.Creator<v0> CREATOR = new i0(3);
    public final g A;
    public final boolean B;
    public final boolean C;
    public final boolean r;
    public final String s;
    public final String t;
    public final v u;
    public final boolean v;
    public final j w;
    public final h x;
    public final m y;
    public final k z;

    public v0(String str, String str2, g gVar, h hVar, j jVar, k kVar, m mVar, v vVar, boolean z, boolean z2, boolean z3, boolean z4) {
        k71.k.g(str, "name");
        k71.k.g(str2, "id");
        k71.k.g(vVar, "vendor");
        k71.k.g(jVar, "modelPickerCategory");
        k71.k.g(hVar, "capabilities");
        this.r = z;
        this.s = str;
        this.t = str2;
        this.u = vVar;
        this.v = z2;
        this.w = jVar;
        this.x = hVar;
        this.y = mVar;
        this.z = kVar;
        this.A = gVar;
        this.B = z3;
        this.C = z4;
    }

    @Override // xn.b1
    public final v C() {
        return this.u;
    }

    @Override // xn.b1
    public final boolean E() {
        return this.B;
    }

    @Override // xn.b1
    public final g c() {
        return this.A;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.r == v0Var.r && k71.k.b(this.s, v0Var.s) && k71.k.b(this.t, v0Var.t) && k71.k.b(this.u, v0Var.u) && this.v == v0Var.v && this.w == v0Var.w && k71.k.b(this.x, v0Var.x) && k71.k.b(this.y, v0Var.y) && k71.k.b(this.z, v0Var.z) && k71.k.b(this.A, v0Var.A) && this.B == v0Var.B && this.C == v0Var.C;
    }

    @Override // xn.b1
    public final String getId() {
        return this.t;
    }

    @Override // xn.b1
    public final String getName() {
        return this.s;
    }

    @Override // xn.b1
    public final h h() {
        return this.x;
    }

    public final int hashCode() {
        int hashCode = (this.x.hashCode() + ((this.w.hashCode() + x.i.e((this.u.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(Boolean.hashCode(this.r) * 31, this.s, 31), this.t, 31)) * 31, 31, this.v)) * 31)) * 31;
        m mVar = this.y;
        int hashCode2 = (hashCode + (mVar == null ? 0 : Boolean.hashCode(mVar.r))) * 31;
        k kVar = this.z;
        int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        g gVar = this.A;
        return Boolean.hashCode(this.C) + x.i.e((hashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31, this.B);
    }

    @Override // xn.b1
    public final j j() {
        return this.w;
    }

    @Override // xn.b1
    public final boolean o() {
        return this.v;
    }

    @Override // xn.b1
    public final k r() {
        return this.z;
    }

    public final String toString() {
        StringBuilder t = com.github.rudroid.copilot.h1.t("CopilotAgentAiModel(auto=", ", name=", this.s, ", id=", this.r);
        t.append(this.t);
        t.append(", vendor=");
        t.append(this.u);
        t.append(", modelPickerEnabled=");
        t.append(this.v);
        t.append(", modelPickerCategory=");
        t.append(this.w);
        t.append(", capabilities=");
        t.append(this.x);
        t.append(", supports=");
        t.append(this.y);
        t.append(", policy=");
        t.append(this.z);
        t.append(", billing=");
        t.append(this.A);
        t.append(", isDefault=");
        return com.github.rudroid.m0.m(t, this.B, ", preview=", this.C, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeParcelable(this.u, i);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeString(this.w.name());
        this.x.writeToParcel(parcel, i);
        m mVar = this.y;
        if (mVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mVar.writeToParcel(parcel, i);
        }
        k kVar = this.z;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, i);
        }
        g gVar = this.A;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gVar.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
    }

    @Override // xn.b1
    public final boolean y() {
        return this.C;
    }

    @Override // xn.b1
    public final m z() {
        return this.y;
    }
}
