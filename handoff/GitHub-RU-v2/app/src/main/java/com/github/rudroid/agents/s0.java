package com.github.rudroid.agents;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f7308a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7309b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f7310c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f7311d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7312e;

    public s0(ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, boolean z11) {
        this.f7308a = arrayList;
        this.f7309b = z10;
        this.f7310c = arrayList2;
        this.f7311d = arrayList3;
        this.f7312e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f7308a.equals(s0Var.f7308a) && this.f7309b == s0Var.f7309b && this.f7310c.equals(s0Var.f7310c) && this.f7311d.equals(s0Var.f7311d) && this.f7312e == s0Var.f7312e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7312e) + no.a.b(this.f7311d, no.a.b(this.f7310c, x.i.e(this.f7308a.hashCode() * 31, 31, this.f7309b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AgentSelectionUiState(selectableCodingAgents=");
        sb2.append(this.f7308a);
        sb2.append(", shouldDisplayCustomAgents=");
        sb2.append(this.f7309b);
        sb2.append(", selectableCustomAgents=");
        sb2.append(this.f7310c);
        sb2.append(", selectedAgents=");
        sb2.append(this.f7311d);
        sb2.append(", isMultiSelect=");
        return jo.f4.s(sb2, this.f7312e, ")");
    }
}
