package com.github.domain.database.serialization;

import a5.s;
import b21.l;
import com.github.domain.searchandfilter.filters.data.milestone.NoMilestone;
import com.google.android.gms.internal.measurement.d5;
import f1.q6;
import fk.i;
import k71.x;
import l81.n;
import yz0.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final i Companion = new i();
    public static final l a;
    public static final n b;

    static {
        kotlinx.serialization.modules.d dVar = new kotlinx.serialization.modules.d();
        s sVar = new s(x.a(v2.class));
        sVar.H(x.a(NoMilestone.class), NoMilestone.Companion.serializer());
        sVar.H(x.a(SerializableMilestone.class), SerializableMilestone.Companion.serializer());
        sVar.q(new q6(15));
        sVar.n(dVar);
        a = dVar.a();
        b = d5.q(new q6(16));
    }
}
