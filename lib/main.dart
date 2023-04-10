import 'package:flutter/material.dart';
import 'package:flutter_application_1/pigeon.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
      appBar: AppBar(),
      body: Center(
        child: ElevatedButton(onPressed: () {
          MessageApi().toastMessage('arg_message');
        }, child: const Text('Click')),
      ),
    ));
  }
}
