import 'package:pigeon/pigeon.dart';

@HostApi()
abstract class MessageApi {
  void toastMessage(String message);
}
