package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import c21.u;

/* loaded from: /home/user/work/p/classes4.dex */
public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog J0;
    public DialogInterface.OnCancelListener K0;
    public AlertDialog L0;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.K0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog v4() {
        Dialog dialog = this.J0;
        if (dialog != null) {
            return dialog;
        }
        ((DialogFragment) this).A0 = false;
        if (this.L0 == null) {
            Context y3 = y3();
            u.g(y3);
            this.L0 = new AlertDialog.Builder(y3).create();
        }
        return this.L0;
    }

    public static  y3(Object... a) {
        return null;
    }

    public static  z4(Object... a) {
        return null;
    }
}
