import SwiftUI
import clients

struct TestView: View {
    @StateObject var viewModel = TestViewModel()
    @State private var test = 0
    
    var body: some View {
        Text(String(test))
            .task {
                for await test in viewModel.test.stream(Int.self) {
                    self.test = test
                    print(test)
                }
            }
    }
}
