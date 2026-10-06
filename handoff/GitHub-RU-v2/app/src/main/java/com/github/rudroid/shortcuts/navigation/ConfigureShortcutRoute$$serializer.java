package com.github.rudroid.shortcuts.navigation;

import com.google.android.gms.internal.measurement.d5;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m71.a;
import w61.c;
import w61.h;
import wm.b;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class ConfigureShortcutRoute$$serializer implements d0 {
    public static final int $stable;
    public static final ConfigureShortcutRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ConfigureShortcutRoute$$serializer configureShortcutRoute$$serializer = new ConfigureShortcutRoute$$serializer();
        INSTANCE = configureShortcutRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.shortcuts.navigation.ConfigureShortcutRoute", configureShortcutRoute$$serializer, 5);
        e1Var.l("shortcut", true);
        e1Var.l("isEditing", false);
        e1Var.l("synchronousUpdates", false);
        e1Var.l("useLightweightCreationUi", false);
        e1Var.l("isFilterBarVisibleByDefault", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private ConfigureShortcutRoute$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        g gVar = g.a;
        return new KSerializer[]{a.z((KSerializer) ConfigureShortcutRoute.w[0].getValue()), gVar, gVar, gVar, gVar};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ConfigureShortcutRoute m79deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr = ConfigureShortcutRoute.w;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        b bVar = null;
        boolean z5 = true;
        while (z5) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z5 = false;
            } else if (t == 0) {
                bVar = (b) b.x(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), bVar);
                i |= 1;
            } else if (t == 1) {
                z = b.p(serialDescriptor, 1);
                i |= 2;
            } else if (t == 2) {
                z2 = b.p(serialDescriptor, 2);
                i |= 4;
            } else if (t == 3) {
                z3 = b.p(serialDescriptor, 3);
                i |= 8;
            } else {
                if (t != 4) {
                    throw new UnknownFieldException(t);
                }
                z4 = b.p(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.g(serialDescriptor);
        return new ConfigureShortcutRoute(i, bVar, z, z2, z3, z4);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ConfigureShortcutRoute configureShortcutRoute) {
        k.g(encoder, "encoder");
        k.g(configureShortcutRoute, "value");
        b bVar = configureShortcutRoute.r;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = ConfigureShortcutRoute.w;
        if (b.X(serialDescriptor) || bVar != null) {
            b.H(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), bVar);
        }
        b.C(serialDescriptor, 1, configureShortcutRoute.s);
        b.C(serialDescriptor, 2, configureShortcutRoute.t);
        b.C(serialDescriptor, 3, configureShortcutRoute.u);
        b.C(serialDescriptor, 4, configureShortcutRoute.v);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
