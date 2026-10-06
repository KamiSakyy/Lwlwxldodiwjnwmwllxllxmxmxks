package com.github.domain.database.serialization;

import a5.s;
import b21.l;
import com.github.domain.searchandfilter.filters.data.assignee.NoAssignee;
import com.google.android.gms.internal.measurement.d5;
import f1.q6;
import k71.x;
import l81.n;
import yz0.f;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final fk.a Companion = new fk.a();
    public static final l a;
    public static final n b;

    static {
        kotlinx.serialization.modules.d dVar = new kotlinx.serialization.modules.d();
        s sVar = new s(x.a(f.class));
        sVar.H(x.a(NoAssignee.class), NoAssignee.Companion.serializer());
        sVar.H(x.a(SerializableAssignee.class), SerializableAssignee.Companion.serializer());
        sVar.q(new q6(11));
        sVar.n(dVar);
        a = dVar.a();
        b = d5.q(new q6(12));
    }
    public static Object z(Object p1) { return null; }
}
