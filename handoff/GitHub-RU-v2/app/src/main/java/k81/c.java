package k81;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c extends o0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SerialDescriptor serialDescriptor, int i) {
        super(serialDescriptor);
        this.b = i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        switch (this.b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
    public static final Object u = null;
    public static final Object v = null;
    public static final Object w = null;
}
