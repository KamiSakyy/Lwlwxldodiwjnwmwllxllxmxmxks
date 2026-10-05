package com.github.domain.shortcuts.model;

import bm.n;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.google.android.gms.internal.measurement.d5;
import j81.a;
import java.util.List;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class StoredShortcutModel$$serializer implements d0 {
    public static final StoredShortcutModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StoredShortcutModel$$serializer storedShortcutModel$$serializer = new StoredShortcutModel$$serializer();
        INSTANCE = storedShortcutModel$$serializer;
        e1 e1Var = new e1("com.github.domain.shortcuts.model.StoredShortcutModel", storedShortcutModel$$serializer, 8);
        e1Var.l("id", false);
        e1Var.l("fullQueryString", false);
        e1Var.l("name", false);
        e1Var.l("query", false);
        e1Var.l("color", false);
        e1Var.l("icon", false);
        e1Var.l("scope", false);
        e1Var.l("targetType", false);
        descriptor = e1Var;
    }

    private StoredShortcutModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = StoredShortcutModel.z;
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, q1Var, q1Var, n.a, hVarArr[4].getValue(), hVarArr[5].getValue(), hVarArr[6].getValue(), hVarArr[7].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final StoredShortcutModel m70deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        h[] hVarArr = StoredShortcutModel.z;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        ShortcutColor shortcutColor = null;
        ShortcutIcon shortcutIcon = null;
        com.github.service.models.response.shortcuts.a aVar = null;
        ShortcutType shortcutType = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.r(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) b.A(serialDescriptor, 3, n.a, list);
                    i |= 8;
                    break;
                case 4:
                    shortcutColor = (ShortcutColor) b.A(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), shortcutColor);
                    i |= 16;
                    break;
                case 5:
                    shortcutIcon = (ShortcutIcon) b.A(serialDescriptor, 5, (KSerializer) hVarArr[5].getValue(), shortcutIcon);
                    i |= 32;
                    break;
                case 6:
                    aVar = (com.github.service.models.response.shortcuts.a) b.A(serialDescriptor, 6, (KSerializer) hVarArr[6].getValue(), aVar);
                    i |= 64;
                    break;
                case 7:
                    shortcutType = (ShortcutType) b.A(serialDescriptor, 7, (KSerializer) hVarArr[7].getValue(), shortcutType);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(t);
            }
        }
        b.g(serialDescriptor);
        return new StoredShortcutModel(i, str, str2, str3, list, shortcutColor, shortcutIcon, aVar, shortcutType);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, StoredShortcutModel storedShortcutModel) {
        k.g(encoder, "encoder");
        k.g(storedShortcutModel, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = StoredShortcutModel.z;
        b.J(serialDescriptor, 0, storedShortcutModel.r);
        b.J(serialDescriptor, 1, storedShortcutModel.s);
        b.J(serialDescriptor, 2, storedShortcutModel.t);
        b.I(serialDescriptor, 3, n.a, storedShortcutModel.u);
        b.I(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), storedShortcutModel.v);
        b.I(serialDescriptor, 5, (KSerializer) hVarArr[5].getValue(), storedShortcutModel.w);
        b.I(serialDescriptor, 6, (KSerializer) hVarArr[6].getValue(), storedShortcutModel.x);
        b.I(serialDescriptor, 7, (KSerializer) hVarArr[7].getValue(), storedShortcutModel.y);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
