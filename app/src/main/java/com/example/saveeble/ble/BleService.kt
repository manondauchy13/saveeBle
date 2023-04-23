package com.example.saveeble.ble

import android.bluetooth.BluetoothGattCharacteristic
import android.widget.ExpandableListView

class BleService (val name: String, val characteristics: MutableList<BluetoothGattCharacteristic>):
    Expandable(name, characteristics){


    }
