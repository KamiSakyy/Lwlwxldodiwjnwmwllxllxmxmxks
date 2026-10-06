package com.github.domain.searchandfilter.filters.data;

import a0.c2;
import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import com.github.service.agents.AgentAssignment;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import w80.w3;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class CustomInstructionsFilter extends d {
    public AgentAssignment v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<CustomInstructionsFilter> CREATOR = new a21.g(17);
    public static final w61.h[] w = {w.s(w61.i.r, new c2(22)), null, null};
    public static final w3 x = new w3(1);

    public static final class Companion {
        public final KSerializer serializer() {
            return CustomInstructionsFilter$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomInstructionsFilter(int i, l lVar, String str, AgentAssignment agentAssignment) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, CustomInstructionsFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = null;
        } else {
            this.v = agentAssignment;
        }
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        return this.v != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomInstructionsFilter) && k.b(this.v, ((CustomInstructionsFilter) obj).v);
    }

    public final int hashCode() {
        AgentAssignment agentAssignment = this.v;
        if (agentAssignment == null) {
            return 0;
        }
        return agentAssignment.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(Companion.serializer(), this);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return "";
    }

    public final String toString() {
        return "CustomInstructionsFilter(agentAssignment=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeParcelable(this.v, i);
    }

    public CustomInstructionsFilter(AgentAssignment agentAssignment) {
        super(l.g0, "FILTER_CUSTOM_INSTRUCTIONS");
        this.v = agentAssignment;
    }
}
