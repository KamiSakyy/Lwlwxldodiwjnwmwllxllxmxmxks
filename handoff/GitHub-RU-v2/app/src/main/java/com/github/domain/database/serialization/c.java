package com.github.domain.database.serialization;

import a5.s;
import b21.l;
import com.github.domain.searchandfilter.filters.data.label.NoLabel;
import com.google.android.gms.internal.measurement.d5;
import f1.q6;
import fk.h;
import k71.x;
import l81.n;
import yz0.k2;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final h Companion = new h();
    public static final l a;
    public static final n b;

    static {
        kotlinx.serialization.modules.d dVar = new kotlinx.serialization.modules.d();
        s sVar = new s(x.a(k2.class));
        sVar.H(x.a(NoLabel.class), NoLabel.Companion.serializer());
        sVar.H(x.a(SerializableLabel.class), SerializableLabel.Companion.serializer());
        sVar.q(new q6(13));
        sVar.n(dVar);
        a = dVar.a();
        b = d5.q(new q6(14));
    }
}
