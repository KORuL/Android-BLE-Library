/*
 * Copyright (c) 2018, Nordic Semiconductor
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
 * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package no.nordicsemi.android.ble.callback

import android.bluetooth.BluetoothDevice

interface FailCallback {

    /**
     * A callback invoked when the request has failed with status other than
     * [android.bluetooth.BluetoothGatt.GATT_SUCCESS].
     *
     * @param device target device.
     * @param status error status code, one of BluetoothGatt#GATT_* constants or
     * [.REASON_DEVICE_DISCONNECTED], [.REASON_TIMEOUT],
     * [.REASON_DEVICE_NOT_SUPPORTED] (only for Connect request),
     * [.REASON_BLUETOOTH_DISABLED], [.REASON_NULL_ATTRIBUTE],
     * [.REASON_VALIDATION] or [.REASON_REQUEST_FAILED] (for other reason).
     */
    fun onRequestFailed(device: BluetoothDevice, status: Int)

    companion object {
        const val REASON_DEVICE_DISCONNECTED = -1
        const val REASON_DEVICE_NOT_SUPPORTED = -2
        const val REASON_NULL_ATTRIBUTE = -3
        const val REASON_REQUEST_FAILED = -4
        const val REASON_TIMEOUT = -5
        const val REASON_VALIDATION = -6
        const val REASON_BLUETOOTH_DISABLED = -100
    }
}
