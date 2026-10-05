package z11;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import c21.u;

/* loaded from: /home/user/work/p/classes4.dex */
public class c extends DialogFragment {
    public Dialog r;
    public DialogInterface.OnCancelListener s;
    public AlertDialog t;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.s;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.r;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.t == null) {
            Activity activity = getActivity();
            u.g(activity);
            this.t = new AlertDialog.Builder(activity).create();
        }
        return this.t;
    }
}
